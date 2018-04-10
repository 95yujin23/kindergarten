<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>영유아 일지 목록</title>

<!-- Bootstrap Core CSS -->
<link href="./resources/vendor/css/bootstrap.min.css" rel="stylesheet">

<!-- MetisMenu CSS -->
<link href="./resources/vendor/css/metisMenu.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="./resources/vendor/css/sb-admin-2.css" rel="stylesheet">

<!-- Morris Charts CSS -->
<link href="./resources/vendor/css/morris.css" rel="stylesheet">

<!-- Report CSS -->
<link href="./resources/vendor/css/report.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="./resources/vendor/fonts/font-awesome.min.css" rel="stylesheet" type="text/css">

</head>
<body>
 <div class="container">
         <div class="row">
            <div class="col-12 mt-4">
               <div class="text-white text-center d-block mb-1"><h4 class="titulo pb-2 pt-2">Formulário de Solicitação de Antifúngicos</h4></div>
               <div class="mb-2 pl-2 text-white d-block titulo">RELATÓRIO MÉDICO</div>
               <table class="table table-sm">
                  <tbody>
                     <tr>
                        <td class="w-25 text-center" style="border-right:1px #41719C solid;border-top:5px #41719C solid">Paciente <span class="text-danger">*</span></td>
                        <td colspan="3" class="w-75" style="background-color:#D6E6F4;border-top:5px #41719C solid;border-right:1px #41719C solid;">
                           <input type="text" name="paciente" id="paciente" class="w-100 no-print-required">
                        </td>
                     </tr>
                     <tr>
                        <td style="width:200px;border-right:1px #41719C solid;" class="text-center">Data de Nascimento <span class="text-danger">*</span></td>
                        <td>
                           <input type="date" name="dtNascimento" id="dtNascimento" class="w-100 element-white no-print-required">
                        </td>
                        <td class="text-right">Número de Atendimento <span class="text-danger">*</span></td>
                        <td style="border-right:1px #41719C solid;"><input type="text" name="nrAtendimento" id="nrAtendimento" class="w-100 no-print-required element-white"></td>
                     </tr>
                     <tr>
                        <td style="width:200px;border-right:1px #41719C solid;" class="text-center">Médico Solicitante <span class="text-danger">*</span></td>
                        <td style="background-color:#D6E6F4;">
                           <input type="text" name="medicoSolicitante" id="medicoSolicitante" class="w-100 no-print-required">
                        </td>
                        <td style="background-color:#D6E6F4;" class="text-right">C.R.M. <span class="text-danger">*</span></td>
                        <td style="border-right:1px #41719C solid;background-color:#D6E6F4; "><input type="text" name="crm" id="crm" class="w-100 no-print-required"></td>
                     </tr>
                     <tr>
                        <td style="width:200px;border-right:1px #41719C solid;" class="text-center" >1 - Diagnóstico <span class="text-danger">*</span></td>
                        <td colspan="3" style="border-right:1px #41719C solid;">
                           <div class="select-wrapper">
                              <select name="diagnostico" id="diagnostico" style="border:0;white-space:pre-wrap;white-space:-moz-pre-wrap; " class="w-100 element-white no-print-required">
                                 <option class="no-print">Escolher ‣</option>
                                 <option>C82 - Linfona não-Hodgkin, folicular (nodular)</option>
                                 <option>C83 - Linfona não-Hodgkin difuso</option>
                                 <option>C84 - Linfomas de células T cutâneas e periféricas</option>
                                 <option>C85 - Linfoma não-Hodgkin de outros tipos e de tipo não especificado</option>
                                 <option>C88 - Doenças imunoproliferativas malignas</option>
                                 <option>C90 - Mieloma múltiplo e neoplasias malignas de plasmócitos</option>
                                 <option>C91 - Leucemia linfóide</option>
                                 <option>C92 - Leucemia mielóide</option>
                                 <option>C93 - Leucemia monocítica</option>
                                 <option>C94 - Outras leucemias de células de tipo especificado</option>
                                 <option>C95 - Leucemia de tipo celular não especificado</option>
                                 <option>C96 - Outras neoplasias malignas e as não especificadas dos tecidos linfático, hematopoético e tecidos correlatos</option>
                                 <option>D46 - Síndromes mielodisplásicas</option>
                                 <option>D47 - Outras neoplasias de comportamento incerto ou desconhecido dos tecidos linfático, hematopoético e tecidos correlatos</option>
                                 <option>D60 - Aplasia pura da série vermelha, adquirida (eritroblastopenia)</option>
                                 <option>D61 - Outras anemias aplásticas</option>
                              </select>                               
                           </div>
                        </td>
                     </tr>
                     <tr>
                        <td style="width:200px;border-right:1px #41719C solid;" class="text-center" >2 - Procedimento Autorizado <span class="text-danger">*</span></td>
                        <td colspan="3" style="background-color:#D6E6F4;border-right:1px #41719C solid;">
                           <div class="select-wrapper">
                              <select name="procedimento" id="procedimento" style="border:0;white-space:pre-wrap;white-space:-moz-pre-wrap; " class="w-100 no-print-required">
                                 <option class="no-print">Escolher ‣</option>
                                 <option>0303020032 - Tratamento de anemia aplástica e outras anemias</option>
                                 <option>0304080039 - Internação para quimioterapia de leucemias agudas/crônicas agudizadas</option>
                                 <option>0304100013 - Tratamento de intercorrências clínicas em pacientes oncológicos</option>
                                 <option>0506020045 - Tratamento de intercorrência pós-transplante de órgãos / células-tronco hematopoéticas</option>
                                 <option>0506020100 - Tratamento de intercorrência pós-transplante alogênico de células-tronco hematopoéticas</option>
                                 <option>0506020118 - Tratamento de intercorrência pós transplante autológo de células-tronco hematopoéticas</option>
                              </select>                           
                           </div>
                        </td>
                     </tr>
                     <tr>
                        <td style="width:200px;border-right:1px #41719C solid;" class="text-center" >3 - Laudo para Comprovação da Doença <span class="text-danger">*</span></td>
                        <td colspan="3" style="border-right:1px #41719C solid;">
                           <div class="input-group">
                              <span class="input-group-addon">
                                <input type="checkbox" aria-label="Checkbox for following text input" id="biopsia_de_linfonodo">
                              </span>
                              <label class="form-control no-print-required" aria-label="Text input with checkbox" for="biopsia_de_linfonodo" style="background-color:#FFF;font-size:11px;">Biópsia de Linfonodo</label>
                              <span class="input-group-addon">
                                <input type="checkbox" aria-label="Checkbox for following text input" id="biopsia_de_medula">
                              </span>
                              <label class="form-control no-print-required" aria-label="Text input with checkbox" for="biopsia_de_medula" style="background-color:#FFF;font-size:11px;">Biópsia de Medula Óssea</label>
                              <span class="input-group-addon">
                                <input type="checkbox" aria-label="Checkbox for following text input" id="mielograma">
                              </span>
                              <label class="form-control no-print-required" aria-label="Text input with checkbox" for="mielograma" style="background-color:#FFF;font-size:11px;">Mielograma</label>
                            </div>
                            <small class="no-print">Pelo menos um dos seguintes laudos deve ser anexado ao relatório</small>
                        </td>
                     </tr>                     
                  </tbody>
               </table>
            </div>
         </div>
                
            <div class="col-4">
               <h6>DURAÇÃO DO TRATAMENTO <span class="text-danger">*</span></h6>
               <input type="text" name="dias" id="dias" class="col-2 element-white no-print-required" style="border-bottom: 1px solid #c3c3c3" maxlength="3"> dias
            </div>
         </div>          
         <div class="row mt-3 mb-3">
            <div class="col-12">
               <h6>6 - INDICAÇÃO/JUSTIFICATIVA DO USO DO MEDICAMENTO <span class="text-danger">*</span></h6>
               <textarea id="justificativa" name="justificativa" class="w-100 no-print-required"></textarea>
            </div>
         </div>         
         <div class="row mt-3 mb-3">
            <div class="col-12">
               <h6>7 - CARACTERÍSTICAS CLÍNICAS E EVOLUÇÃO DA DOENÇA <span class="text-danger">*</span></h6>
               <textarea id="caracteristicas" name="caracteristicas" class="w-100 no-print-required"></textarea>
            </div>
         </div>         
         <div class="row mt-3 mb-3">
            <div class="col-12">
               <h6>8 - TRATAMENTOS PRÉVIOS E OUTRAS INFORMAÇÕES PERTINENTES <span class="text-danger">*</span></h6>
               <textarea id="tratamentos_previos" name="tratamentos_previos" class="w-100 no-print-required"></textarea>
            </div>
         </div>         
         <div class="row mt-5">
            <div class="col-12 text-center">
               <span class="d-inline-block" style="border-top:1px #000 solid;width:600px;">Assinatura e Carimbo do Solicitante</span>
            </div>
         </div>         
         <div class="row mt-3 mb-3">
            <div class="col-12">
               <div class="alert alert-danger mb-2 text-center d-none" id="msgValidaForm" role="alert">
                 Você deve preencher <strong>todos os campos</strong> para realizar a impressão!
               </div>                              
               <button class="btn btn-primary w-100 no-print" id="btnPrint">Imprimir Documento</button>
            </div>
         </div>         
     

  <!-- FOOTER : Navigation -->
	<c:import url="../inc/footer.jsp"></c:import>
	<!-- FOOTER -->

	<!-- jQuery -->
	<script src="resources/vendor/js/jquery.min.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="resources/vendor/js/bootstrap.min.js"></script>

	<!-- Metis Menu Plugin JavaScript -->
	<script src="resources/vendor/js/metisMenu.min.js"></script>

	<!-- Morris Charts JavaScript -->
	<script src="resources/vendor/js/raphael.min.js"></script>
	<script src="resources/vendor/js/morris.min.js"></script>
	<script src="resources/vendor/js/morris-data.js"></script>

	<!-- Custom Theme JavaScript -->
	<script src="resources/vendor/js/sb-admin-2.js"></script>

</body>
</html>