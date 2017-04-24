<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script>
    <script src="<c:url value='/static/js/app.js' />"></script>
      	
	<head>  
    	<title>AngularJS Example</title>  
  	</head>
  	<body ng-app="myApp" ng-controller="KeyController as key" ng-keydown="key.count($event)">
  	<div>{{key.total}}</div>
      	<div ng-controller="TestController as ctrl">
			<div>{{ctrl.word}}</div>
			<button ng-click="ctrl.change1()">Change 1</button>
 			<button ng-click="ctrl.change2()">Change 2</button>
 			
 			<div type="text" id="test"/>
 			<button ng-click="ctrl.click()">Test</button>
 			{{ctrl.div}}
      	</div>
  	</body>
</html>