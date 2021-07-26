<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<main class="readPage">
    <h1 class="sectionName" style="color: #843C0C;">Update-Page</h1>
	<form class="readBox" action="/icloud/updateProc" method="post">
        <div class="buttonBox">
            <input type="submit" class="update" value="수정 완료">
        </div>
        <input type="hidden" name="memoNum" value="${memoNum }">
		<input type="text" class="inputTitle" name="title" value="${title }">
        <br>
        <textarea name="content" class="content">${content }</textarea>
	</form>
</main>
    
