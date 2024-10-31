<%-- 
    Document   : index
    Created on : 29 oct 2024, 10:43:38 a.m.
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% application.setAttribute("theme","dark"); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
        <link rel="stylesheet" href="./styles/global.css"/>
    </head>
    <body>
    <div class="form-container">
        <h2>Crear Cuenta</h2>
        <form>
            <label for="first-name">Nombre *</label>
            <input type="text" id="first-name" name="first-name" required>

            <label for="last-name">Apellido *</label>
            <input type="text" id="last-name" name="last-name" required>

            <label for="email">Email *</label>
            <input type="email" id="email" name="email" required>

            <label for="password">Contraseña *</label>
            <input type="password" id="password" name="password" required>

            <label for="confirm-password">Confirmar Contraseña *</label>
            <input type="password" id="confirm-password" name="confirm-password" required>

            <label>Género:</label>
            <input type="radio" id="male" name="gender" value="male">
            <label for="male">Hombre</label>
            <input type="radio" id="female" name="gender" value="female">
            <label for="female">Mujer</label>

            <label>Hobbies:</label>
            <input type="checkbox" id="music" name="hobbies" value="music">
            <label for="music">Música</label>
            <input type="checkbox" id="sports" name="hobbies" value="sports">
            <label for="sports">Deportes</label>
            <input type="checkbox" id="travel" name="hobbies" value="travel">
            <label for="travel">Viajar</label>
            <input type="checkbox" id="movies" name="hobbies" value="movies">
            <label for="movies">Cine</label>

            <label for="income-source">Fuente de Ingresos</label>
            <select id="income-source" name="income-source">
                <option value="employment">Empleo</option>
                <option value="business">Negocio</option>
                <option value="investment">Inversiones</option>
                <option value="other">Otro</option>
            </select>

            <label for="income">Ingresos Mensuales</label>
            <input type="range" id="income" name="income" min="0" max="10000" step="100">
            <div class="range-value" id="rangeValue">0</div>

            <label for="profile-picture">Foto de Perfil</label>
            <input type="file" id="profile-picture" name="profile-picture">

            <label for="age">Edad</label>
            <input type="number" id="age" name="age">

            <label for="bio">Biografía</label>
            <textarea id="bio" name="bio"></textarea>

            <button type="submit">Crear</button>
        </form>
    </div>
</body>
</html>
