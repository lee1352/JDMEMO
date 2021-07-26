<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<main class="readPage">
  	<h1 class="sectionName" style="color: #385723">Create-Page</h1>
	<form class="readBox" action="/icloud/writeProc" method="post">
        <div class="buttonBox">
            <input type="submit" class="update" value="작성 완료">
        </div>
		<input type="text" class="inputTitle" name="title" placeholder="제목을 입력해주세요.">
        <br>
        <textarea name="content" class="content" placeholder="내용을 입력해주세요"></textarea>
	</form>
</main>