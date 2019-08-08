<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html ng-app="assessment">
	<head>
		<title>Angular-Restful-Client</title>
 		<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.5/angular.min.js"></script>
	</head>
	<!--TODO: In-progress. Add the correct properties from the response to display in div's-->
	<!--TODO: In-progress. Add some styling to the different elements-->
	<body ng-controller="issueController">
	    <div ng-repeat="issue in listIssues">
	        <span>{{issue.title}}</span>
	        <span>{{issue.body}}</span>
	        <span>{{issue.user}}</span>
	        <span>{{issue.assignee}}</span>
	    </div>
	    <!--TODO: In-progress. Research the URI that will give you the list of issues from github in the angular repo for the past seven days-->
	    <script type="text/javascript">
	        var angularRepoApp = angular.module("angularRepoApp", []);
	        angularRepoApp.controller('issueController', function ($scope, $http) {
	            $http.get('https://api.github.com/search/repositories?q=angular').success(function (response) {
	                $scope.listIssues = response.data;
	            });
	        });
	    </script>
	</body>
</html>


