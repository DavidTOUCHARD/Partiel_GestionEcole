<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
        <form method="post" action="inscription">
            <fieldset>
                <legend>Ajout Etudiant</legend>
                <p>Vous pouvez vous inscrire via ce formulaire.</p>

                <label for="email">Adresse email <span class="requis">*</span></label>
                <input type="text" id="email" name="email" value="" size="20" maxlength="60" />
                <br />

 				<label for="telephone">telephone <span class="requis">*</span></label>
                <input type="text" id="telephone" name="telephone" value="" size="20" maxlength="60" />
                <br />
                 <label for="datenaissance">datenaissance <span class="requis">*</span></label>
                <input type="text" id="datenaissance" name="datenaissance" value="" size="20" maxlength="60" />
                <br />

 <label for="adresse">adresse <span class="requis">*</span></label>
                <input type="text" id="adresse" name="adresse" value="" size="20" maxlength="60" />
                <br />
                <label for="nom">Nom de l'étudiant</label>
                <input type="text" id="nom" name="nom" value="" size="20" maxlength="20" />
                <br />
                <label for="prenom">prenom de l'étudiant</label>
                <input type="text" id="prenom" name="prenom" value="" size="20" maxlength="20" />
                <br />

                <input type="submit" value="Ajout" class="sansLabel" />
                <br />
            </fieldset>
        </form>
    </body>
</html>