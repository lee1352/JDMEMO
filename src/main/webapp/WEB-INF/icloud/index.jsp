<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSMEMO</title>

<link href="/css/style.css" rel="stylesheet">

</head>
<body>

    <main class="wrapper">
        <aside class="listBox">
            <ul>
            	
            	<c:forEach var="list" items="${list }">
	                <a href="/icloud/read?memoNum=${list.memoNum}" class="list">
	                    <li>
	                    	<p class="sub">NO.${list.memoNum}</p>
	                        <div class="title">${list.title}</div>
	                        <p class="sub">${list.content}</p>
	                        <p class="sub">${list.writeDay}</p>
	                    </li>
	                </a>
                </c:forEach>
					
				
            </ul>
        </aside>

        <main class="main">
            <nav>
            	<a href="/icloud/index" class="add">ICloud</a>
                <a href="/icloud/writeForm" class="add">Memo+</a> 
            </nav>

            <section>
				<jsp:include page="/WEB-INF/icloud/${change }"/>
            </section>
        </main>
    </main>

</body>
</html>