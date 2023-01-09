<%@include file="inc/entete.jsp"%>
<%@include file="inc/header.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
  <head>
    <title>Ajouter un patient</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <style>
      .form-control {
        margin-bottom: 20px;
      }
    </style>
  </head>
  <body>
    <div class="container">
      <h1>Ajouter un patient</h1>
      <a href="/" class="btn btn-secondary mb-3">Retour à l'accueil</a>
      <form method="post">
        <div class="form-group">
          <label for="name">Nom</label>
          <input type="text" class="form-control" id="name" name="name" placeholder="Nom du patient">
        </div>
        <div class="form-group">
          <label for="age">Age</label>
          <input type="number" class="form-control" id="age" name="age" placeholder="Age du patient">
        </div>
        <div class="form-group">
          <label for="gender">Genre</label>
          <input type="text" class="form-control" id="gender" name="gender" placeholder="Genre du patient">
        </div>
        <div class="form-group">
          <label for="address">Adresse</label>
          <input type="text" class="form-control" id="address" name="address" placeholder="Adresse du patient">
        </div>
        <div class="form-group">
          <label for="phoneNumber">Numéro de téléphone</label>
          <input type="text" class="form-control" id="phoneNumber" name="phoneNumber" placeholder="Numéro de téléphone du patient">
        </div>
        <button type="submit" class="btn btn-primary">Ajouter le patient</button>
      </form>
    </div>
  </body>
</html>
<%@include file="inc/footer.jsp"%>
