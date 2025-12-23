<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PHP String</title>
</head>
<body>

<?php
// string "string + variable" , 'only string'

$msg1="welcome to ducat india";
$msg2='PHP String';

echo $msg1;
echo '<hr>';
echo $msg2;

echo "<h1>$msg1</h1>";

echo '<h1>$msg2</h1>';

echo "<h1>$msg1 $msg2</h1>";

echo '<h1>' . $msg1 . $msg2 .'</h1>';

echo "<h1>hiiii {$msg1} {$msg2} byeeeee</h1>"
?>



<?php
echo "<h2>{$msg1}</h2>";
?>

<hr>
<h1><?php echo strtoupper($msg1);?></h1>
<h1><?php echo strtolower($msg1);?></h1>
<h1><?php echo ucfirst($msg1);?></h1>
<h1><?php echo ucwords($msg1);?></h1>

<h1><?php echo strlen($msg1);?></h1>

<p><?php echo str_repeat($msg1,100);?></p>


<hr>





    
</body>
</html>