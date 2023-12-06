<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>

<html lang="ko">
<head>
	 <style>
        .bd-placeholder-img {
            font-size: 1.125rem;
            text-anchor: middle;
            -webkit-user-select: none;
            -moz-user-select: none;
            user-select: none;
        }

        @media (min-width: 768px) {
            .bd-placeholder-img-lg {
                font-size: 3.5rem;
            }
        }
    </style>
	
</head>
<body>
	<h3>파일 업로드 (여러 개 파일 업로드)</h3>
    <form id="fileUploadFormMulti" method="post" action="/upload" enctype="multipart/form-data">
	    파일 : <input type="file" id="uploadFileMulti" name="uploadFileMulti" multiple="multiple"><br><br>
	    <input type="submit" value="업로드">
    </form>
    <a href="/download?fileName=c217789d-a917-46ee-aa60-43974ff1111e_제목 없는 다이어그램.drawio.png&item_id=">파일다운로드 시 </a>
</body>

</html>