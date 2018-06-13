<html>

<head>

    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
    <script>
        function doSomething(){
            $.ajax({ url: "/ha/hi", context: document.body, success: function(data){
                    alert(data);
                }});
        }

    </script>

</head>
<body>
<h2>Hello World!</h2>
<button onclick="doSomething()">doSomething</button>


</form>
</body>
</html>
