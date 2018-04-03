package com.cafe24.hanboa.kids;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.cafe24.hanboa.teacher.Teacher;
import com.cafe24.hanboa.teacher.TeacherService;

@Service
@Transactional
public class KidsService {

	@Autowired
	private KidsDao kidsDao;
	private static final Logger logger = LoggerFactory.getLogger(TeacherService.class);
	
	
	// 1-1. 영유아전체목록
	public List<Kids> getKidsList(){
		logger.debug("1. KidsService -- List<Kids> getKidsList()");
		List<Kids> list = kidsDao.selectKidsList();
		logger.debug("List<Kids> list {}", list);
		logger.debug("-----------------------------------------");
		return list;
	}
	
	// 1-2. 영유아목록조회 (반별)
	public List<Kids> getKidsListByClass(HashMap<String, Object> map) {
		logger.debug("1. KidsService -- List<Kids> getKidsList(HashMap<String, Object> map) : {}", map);
		List<Kids> list = kidsDao.selectKidsListByClass(map);
		logger.debug("List<Kids> list {}", list);
		logger.debug("-----------------------------------------");
		return list;
	}
	// 1-2. 영유아파일조회
	public KidsAndKidsFile getKidsFile(String kidsCd) {
		logger.debug("1. KidsService -- KidsAndKidsFile getKidsFile(String kidsCd) : {}", kidsCd);
		KidsAndKidsFile kidsAndKidsFile = kidsDao.selectKidsFile(kidsCd);
		logger.debug("KidsAndKidsFile : {}", kidsAndKidsFile);
		return kidsAndKidsFile;
	}
	// 2. 영유아 편성 반별 조회 (선생님이 편성된)
	public List<Kids> getKidsListByTeacher(Teacher teacher){
		logger.debug("2. KidsService -- List<Kids> getKidsListByClass(Teacher teacher) : {}", teacher);
		List<Kids> list = kidsDao.selectKidsListByTeacher(teacher);
		logger.debug("List<Kids> : {}", list);
		logger.debug("-----------------------------------------");
		return list;
	}
	// 3. 영유아 개인 조회
	public Kids getKidsOne(String kidsCd) {
		logger.debug("3. KidsService -- getKidsOne(String kidsCd) : {}", kidsCd);
		Kids kids = kidsDao.selectKidsOne(kidsCd);
		logger.debug("Kids kids", kids);
		logger.debug("-----------------------------------------");
		return kids;
	}
	// 4. 영유아 등록
	public void addKids(KidsCommand kidsCommand, String path) throws IOException {
		logger.debug("4. KidsService -- addKids(KidsCommand kidsCommand, String path)");
		logger.debug("kidsCommand : {}",kidsCommand);
		logger.debug("String path : {}",path);
		Kids kids = new Kids();
		KidsFile kidsFile = new KidsFile();
		//kids와 kidsFile 객체 생성
		
		kids.setKidsNm(kidsCommand.getKidsNm());
		//kidsCommand에서 kidsNm가져와 kids에 셋팅
		kids.setKidsDateOfBirth(kidsCommand.getKidsDateOfBirth());
		kids.setKidsAddress(kidsCommand.getKidsAddress());
		kids.setKidsParentPhone(kidsCommand.getKidsParentPhone());
		kids.setKidsSparePhone(kidsCommand.getKidsSparePhone());
		kids.setKidsGender(kidsCommand.getKidsGender());
		kids.setKidsCommutingType(kidsCommand.getKidsCommutingType());
		kids.setKidsCaution(kidsCommand.getKidsCaution());
		kids.setKidsAdmission(kidsCommand.getKidsAdmission());
		kids.setKidsGraduation(kidsCommand.getKidsGraduation());
		kids.setLicenseKindergarten(kidsCommand.getLicenseKindergarten());
		logger.debug("kidsCommand : {}",kidsCommand);
		kidsDao.insertKids(kids);
		String kidsCd = kids.getKidsCd();
		//kidsCd 가져오기
		logger.debug("String kidsCd : {}",kidsCd);
			for(MultipartFile file : kidsCommand.getFile()) {
				
				// 1. DB에 입력하기
				UUID uuid = UUID.randomUUID();
				String fileName = uuid.toString();
				// 중복되지 않는 파일 이름 랜덤으로 받기
				logger.debug("String kidsCd : {}",kidsCd);
				String orginalName = file.getOriginalFilename();
				logger.debug("String kidsCd : {}",kidsCd);
				int pos = orginalName.lastIndexOf(".");
				// 오리지널 이름에서 "." 다음에 있는 확장자 추출
				logger.debug("int pos : {}",pos);
				String fileExt = orginalName.substring(pos+1);		
				//subString : 문자열에서 특정 부분을 골라낼 때 사용 - "."다음에 있는 확장자 + 1
				logger.debug("String fileExt : {}",fileExt);
				// 오리지널 파일 확장자
				fileExt = fileExt.toLowerCase();
				// toLowerCase : 문자열의 모든 알파벳 문자를 소문자로 변환
				logger.debug("fileExt : {}",fileExt);
				long fileSize = file.getSize(); // 오리지널 파일 크기 받기
				logger.debug("long fileSize : {}",fileSize);
				
				kidsFile.setKidsCd(kidsCd);
				kidsFile.setKidsFileNm(fileName);
				kidsFile.setKidsFileExt(fileExt);
				kidsFile.setKidsFileSize(fileSize);
				logger.debug("kidsFile : {}",kidsFile);
				kidsDao.insertKidsFile(kidsFile);
				
				// 2. 파일 저장하기 (resources)
				File temp = new File(path+"\\"+fileName+"."+fileExt); //경로+파일명+확장자
				try {
					file.transferTo(temp);
					//transferTo : 업로드 한 파일 데이터를 지정한 파일에 저장
				}catch (IllegalStateException e) {
					e.printStackTrace();
					if(temp.exists()) {
						}if (temp.delete()) {
							logger.debug("{} 파일 삭제 성공",temp);
						}else {
							logger.debug("{} 파일 삭제 실패",temp);
						}
				}catch(IOException e) {
					e.printStackTrace();
					if(temp.exists()) {
					}if (temp.delete()) {
						logger.debug("{} 파일 삭제 성공",temp);
					}else {
						logger.debug("{} 파일 삭제 실패",temp);
					}
				}
			}
	}
	
	// 5-1. 영유아 수정
	public int modifyKids(Kids kids) {
		logger.debug("3. KidsService -- modifyKids(Kids kids) : {}", kids);
		int modifyKids = kidsDao.updateKids(kids);
		logger.debug("Kids kids", kids);
		return modifyKids;
	}
	// 5-2. 영유아 수정 : 졸업
	public int modifyKidsGraduation(String kidsCd) {
		logger.debug("3. KidsService -- modifyKidsGraduation(String kidsCd) : {}", kidsCd);
		int modifyKidsGraduation = kidsDao.updateKidsGraduation(kidsCd);
		logger.debug("-----------------------------------------");
		return modifyKidsGraduation;
	}
	// 6. 영유아 삭제
	public int removeKids(String kidsCd) {
		logger.debug("3. KidsService -- removeKids(String kidsCd) : {}", kidsCd);
		int removeKids = 0;
		removeKids = kidsDao.deleteKids(kidsCd);
		removeKids = kidsDao.deleteKidsFile(kidsCd);
		logger.debug("-----------------------------------------");
		return removeKids;
	}
}
