if (@$_GET['action']=='delete'){
    $id=$_get['id'];
    $query="DELETE FROM `users` WHERE `id`=`$id`";
    mysqli_query($dbcon,$query);
    header("location:delete.php");
}   
<td><a href="?id=<?php echo $res['id'];?>&action=delete">Delete Data </td>