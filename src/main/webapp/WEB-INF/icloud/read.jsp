<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<main class="readPage">
    <h1 class="sectionName" style="color: #1F4E79;">Read-Page</h1>
	<form class="readBox" action="/icloud/updateForm" method="post">
        <div class="buttonBox">
            <input type="submit" class="update" value="수정">
            <input type="button" class="delete" value="삭제" onclick="location.href='/icloud/delete?memoNum=${icloud.memoNum}'">
        </div>
        <input type="hidden" name="memoNum" value="${memoNum}">
		<input type="text" class="inputTitle" name="title" value="${icloud.title}" readonly>
        <br>
        <textarea name="content" class="content" readonly>${icloud.content}</textarea>
	</form>
</main>