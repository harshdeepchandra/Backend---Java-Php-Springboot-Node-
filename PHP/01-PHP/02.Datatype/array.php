<?php
// php array : 
/*
index array (basic array)
associative Array
*/

// Parse error: syntax error, unexpected token ","
// $num=10,20,30,40,50;

$num=array(10,20,30,40,50);

// Warning: Array to string conversion
// echo $num;

echo '<pre>';
print_r($num);
echo '</pre>';

echo $num[2];

echo $num[2] + $num[4];

// example mixed nested

$mixed=array(101,"Ducat",10.25,'India',array("a","b","c",array("x","y","z")),201,202);

echo '<pre>';
print_r($mixed);
echo '</pre>';

echo $mixed[3];

echo $mixed[4][1];

echo $mixed[4][3][1];

$mixed[3]="USA";
$mixed[4][1]="Book";
$mixed[4][3][1]="Yellow";

$mixed[]="Punit";

echo '<pre>';
print_r($mixed);
echo '</pre>';


// short hand array php v5.3

$user=[1,"User","php",2024];

echo '<pre>';
print_r($user);
echo '</pre>';
















?>