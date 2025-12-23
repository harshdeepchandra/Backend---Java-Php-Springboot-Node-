<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>super-globalvariable</title>
</head>
<body>
    <form method ="post">
    <input type="number" name="num" placeholder="Enter 1 to 5 Numbers">
    <input type="submit" name="res" vslue="Result">
    </form>

<?php
    #Super Global Variable
    //$_GET[]           ---------YEH ARRAY TYPE KA HOTA  HAI 
    //$_POST[]
    //$_REQUEST[] get and post method (reference forms & coupons)
    echo"<h1> GET REQUEST <h1> <hr>";
    echo "<pre>";
    print_r($_GET);
    echo "</pre>";
    echo"<h1> POST REQUEST <h1> <hr>";
    echo "<pre>";
    print_r($_POST);
    echo "</pre>";
    echo"<h1> GET+POST REQUEST <h1> <hr>";
    echo "<pre>";
    print_r($_REQUEST);
    echo "</pre>";
?>
</body>
</html>