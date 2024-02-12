<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
	<script src="${contextPath}/resources/static/js/dear/jquery.min.js"></script>
	<link href="${contextPath}/resources/static/css/dear/bootstrap.min.css" rel="stylesheet">
	<link href="${contextPath}/resources/static/css/dear/style.css" rel="stylesheet">
	<script src="${contextPath}/resources/static/js/dear/bootstrap.min.js"></script>
	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Roboto:wght@700&display=swap" rel="stylesheet">
	<script>
		 $(function () {
		
		    var input = document.getElementById("vd_text");
		
		    input.addEventListener("keyup", function (event) {
		      if (event.keyCode === 13) {
		        event.preventDefault();
		        $('#exampleModal').modal('show');
		      }
		    });
		
		});
  		function fnAddText() {
  			var text = $('#vd_text').val();
  			
  			if(text == "") {
  				 $('#exampleModal').modal('show');
	        } else {
	        	var param= {body: text}; 
	        	
	  			$.ajax({ 
		  			url: "${contextPath}/addTexts.do",  //url
		  			type: "post", // 타입
		  			dataType:"json", //받아올 형태 지정 
		  			data : param, // 파라미터 데이터
		  			//data : $("#form1").serialize(), //파라미터형태로 전송할 경우
		  			success: function(data){       //성공시 data라는 변수에 리턴값이 매칭됨 오브젝트형으로 리턴시 개별 파싱해야됨 
		  			   //alert("당신의 이야기가 등록되었습니다!"); 
		  			   location.reload();
		  			},complete: function(data){
		  			   //실패 했었도 완료가 되었을때..
		  			},error: function (request, status, error) {
		  			   alert("에러"); 
		  			} 
	  			});
	        }
  		}
	</script>
  
</head>

<body>
	<!-- 
	<video id="section_01_vd" class="panels" loop autoplay muted>
        <source src="${contextPath}/resources/static/video/pexels_videos_2439510 (1080p).mp4" type="video/mp4" />
    </video>
    <audio src="${contextPath}/resources/static/video/wave_soundes.mp3" autoplay loop></audio>
     -->
    <div class="msform">
        <ul id="step_3" class="progressbar" style="display: flex;">
            <input id="vd_text" type="text" onKeypress="javascript:if(event.keyCode==13) {fnAddText()}" placeholder="설 연휴 동안이나 살아오면서 들었던 최악의 말은 무엇인가요? 클릭 후 작성해보세요." value="">
            <button type="button" id="vd_btn" onclick="fnAddText()"></button>
        </ul>
    </div>
	<div>
	    <div class="mode_box">
	    	<div>
	    		<ul id="mode_box_ui" style="margin-bottom: 0;">
	    			<c:forEach items="${list}" var="ii" >
						<li class="mode_box_li">${ii.body}</li>
					</c:forEach>
	    		</ul>
	    	</div>
	    </div>
    </div>
    
    <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog modal-dialog-centered" role="document" style="background: #000000a3;color: #fff;box-shadow: 1px 1px #000;">
            <div id="vd_modal" class="modal-content">
            <div class="modal-header">
                
            <div id="pado_modal" class="modal-body" style="color: #fff;">
                먼저 파도에 적을 내용을 입력해주세요.
            </div>
            </div>
        </div>
    </div>
</body>

</html>