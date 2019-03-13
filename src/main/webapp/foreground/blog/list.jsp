<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
	<div class="data_list">
	  		<div class="data_list_title">
			<img src="${pageContext.request.contextPath}/static/images/list_icon.png"/>
			最新博客${pageContext.request.contextPath}</div>
	  		
	  		<div class="datas">
	  			<ul>
	  				<c:forEach items="${blogList }" var="blog">
	  				<li style="margin-bottom: 30px">
	  					<c:choose>
	  						<c:when test="${typeId !=null and releaseDateStr!=null}">
	  							<span class="date"><a href="${pageContext.request.contextPath}/blog/articles/${blog.id }.html?typeId=${typeId}&releaseDateStr=${releaseDateStr}"><fmt:formatDate value="${blog.releaseDate }" type="date" pattern="yyyy年MM月dd日"/></a></span>
	  						</c:when>
	  						<c:when test="${typeId !=null and releaseDateStr==null}">
	  							<span class="date"><a href="${pageContext.request.contextPath}/blog/articles/${blog.id }.html?typeId=${typeId}"><fmt:formatDate value="${blog.releaseDate }" type="date" pattern="yyyy年MM月dd日"/></a></span>
	  						</c:when>
	  						<c:when test="${typeId ==null and releaseDateStr!=null}">
	  							<span class="date"><a href="${pageContext.request.contextPath}/blog/articles/${blog.id }.html?releaseDateStr=${releaseDateStr}"><fmt:formatDate value="${blog.releaseDate }" type="date" pattern="yyyy年MM月dd日"/></a></span>
	  						</c:when>
	  						<c:otherwise>
	  							<span class="date"><a href="${pageContext.request.contextPath}/blog/articles/${blog.id }.html"><fmt:formatDate value="${blog.releaseDate }" type="date" pattern="yyyy年MM月dd日"/></a></span>
	  						</c:otherwise>
	  					</c:choose>
	  					
	  					<c:choose>
	  						<c:when test="${typeId !=null and releaseDateStr!=null}">
	  							<span class="title"><a href="${pageContext.request.contextPath}/blog/articles/${blog.id }.html?typeId=${typeId}&releaseDateStr=${releaseDateStr}">${blog.title }</a></span>
	  						</c:when>
	  						<c:when test="${typeId !=null and releaseDateStr==null}">
	  							<span class="title"><a href="${pageContext.request.contextPath}/blog/articles/${blog.id }.html?typeId=${typeId}">${blog.title }</a></span>
	  						</c:when>
	  						<c:when test="${typeId ==null and releaseDateStr!=null}">
	  							<span class="title"><a href="${pageContext.request.contextPath}/blog/articles/${blog.id }.html?releaseDateStr=${releaseDateStr}">${blog.title }</a></span>
	  						</c:when>
	  						<c:otherwise>
	  							<span class="title"><a href="${pageContext.request.contextPath}/blog/articles/${blog.id }.html">${blog.title }</a></span>
	  						</c:otherwise>
	  					</c:choose>
	  					
	  					
					  	<span class="summary">${blog.summary }...</span>
					  	<span class="img">
					  		<c:forEach var="image" items="${blog.imageList }">
					  		
					  			<c:choose>
			  						<c:when test="${typeId !=null and releaseDateStr!=null}">
			  							<a href="/blog/articles/${blog.id }.html?typeId=${typeId}&releaseDateStr=${releaseDateStr}">${image }</a>&nbsp;&nbsp;
			  						</c:when>
			  						<c:when test="${typeId !=null and releaseDateStr==null}">
			  							<a href="/blog/articles/${blog.id }.html?typeId=${typeId}">${image }</a>&nbsp;&nbsp;
			  						</c:when>
			  						<c:when test="${typeId ==null and releaseDateStr!=null}">
			  							<a href="/blog/articles/${blog.id }.html?releaseDateStr=${releaseDateStr}">${image }</a>&nbsp;&nbsp;
			  						</c:when>
			  						<c:otherwise>
			  							<a href="/blog/articles/${blog.id }.html">${image }</a>&nbsp;&nbsp;
			  						</c:otherwise>
	  							</c:choose>
	  							
					  		</c:forEach>
					  	</span>
					  	<span class="info">发表于 <fmt:formatDate value="${blog.releaseDate }" type="date" pattern="yyyy-MM-dd HH:mm"/> 阅读(${blog.clickHit }) 评论(${blog.replyHit }) </span>
	  					
	  				</li>
	  				 <hr style="height:5px;border:none;border-top:1px dashed gray;padding-bottom:  10px;" />
	  				</c:forEach>
	  			</ul>
	  		</div>
	  		
	  		<nav>
	  <ul class="pagination pagination-sm">
	  	${pageCode }
	  </ul>
	</nav>
	  	</div>