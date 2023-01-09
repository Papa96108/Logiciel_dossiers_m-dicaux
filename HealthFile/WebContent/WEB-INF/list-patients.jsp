<%@include file="inc/entete.jsp"%>
<%@include file="inc/header.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
  <head>
    <title>Liste des patients</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <style>
      .patient-item {
        margin-bottom: 20px;
      }
    </style>
  </head>
  <body>
    <div class="container">
      <h1>Liste des patients</h1>
      <a href="Add" class="btn btn-primary mb-3">Ajouter un patient</a>
      <div class="list-group">
        <c:forEach items="${patients}" var="patient" varStatus="status">
          <div class="list-group-item patient-item">
            <h4 class="list-group-item-heading">${patient.name}</h4>
            <p>
              <strong>Age :</strong> ${patient.age}<br>
              <strong>Genre :</strong> ${patient.gender}<br>
              <strong>Adresse :</strong> ${patient.address}<br>
              <strong>Numéro de téléphone :</strong> ${patient.phoneNumber}
            </p>
            <p>
              <a href="/edit-patient?id=${patient.id}" class="btn btn-primary">Modifier</a>
              <a href="/delete-patient?id=${patient.id}" class="btn btn-danger">Supprimer</a>
            </p>
          </div>
        </c:forEach>
      </div>
    </div>
    <%@include file="inc/footer.jsp"%>
