<%@include file="/WEB-INF/views/template/header.jsp" %>


<!-- NAVBAR
================================================== -->

<div class="container">
<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>
    <div class="carousel-inner" role="listbox">
        <div class="item active">
            <img class="first-slide" src="<c:url value="/resources/images/Car1.PNG" />" alt="First slide">
            <a class="btn btn-lg btn-primary" href="#" role="button">SHOP MEN</a>
            <div class="container">
                <div class="carousel-caption">
                    <h1>GREATER EVERY RUN</h1>
                    <p>Experience greatness in motion. Made for men, the UltraBOOST X runner goes past where the others stop.</p>
                    <p><a class="btn btn-lg btn-primary" href="#" role="button">SHOP MEN</a></p>
                </div>
            </div>
        </div>
        <div class="item">
            <img class="second-slide" src="<c:url value="/resources/images/Car2.PNG" />" alt="Second slide">
            <div class="container">
                <div class="carousel-caption">
                    <h1>GREATER EVERY RUN</h1>
                    <p>Experience greatness in motion. Made for women, the UltraBOOST X runner goes past where the others stop.</p>
                    <p><a class="btn btn-lg btn-primary" href="#" role="button">SHOP WOMEN</a></p>
                </div>
            </div>
        </div>
        <div class="item">
            <img class="third-slide" src="<c:url value="/resources/images/Car3.PNG"/>" alt="Third slide">
            <div class="container">
                <div class="carousel-caption">
                    <h1>SPORTSWEAR</h1>
                    <p>For People Who Pump It Hard At The Gym</p>
                    <p><a class="btn btn-lg btn-primary" href="#" role="button">SHOP SPORTSWEAR</a></p>
                </div>
            </div>
        </div>
    </div>
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
    </a>
</div>
    </div>
<!-- /.carousel -->


<!-- Marketing messaging and featurettes
================================================== -->
<!-- Wrap the rest of the page in another container to center all the content. -->

<div class="container marketing">

    <!-- Three columns of text below the carousel -->
    <div class="row">
        <div class="col-lg-4">
            <a class="btn btn-default" href="<c:url value="/product/productList?searchCondition=Instrument" />"
               role="button">
                <img class="img-circle" src="<c:url value="/resources/images/MenBrowse.PNG" />" alt="Instrument
                Image" width="140" height="140"></a>

            <h2>MEN'S</h2>
            <p>Men's Latest Collection</p>

        </div><!-- /.col-lg-4 -->



        <div class="row">
            <div class="col-lg-4">
                <a class="btn btn-default" href="<c:url value="/product/productList?searchCondition=Record" />"
                   role="button">
                    <img class="img-circle" src="<c:url value="/resources/images/WomenBrowse.PNG" />" alt="Instrument
                Image" width="140" height="140"></a>

                <h2>WOMEN'S</h2>
                <p>Wonmen's Latest Collection</p>

            </div><!-- /.col-lg-4 -->

            <div class="row">
                <div class="col-lg-4">
                    <a class="btn btn-default" href="<c:url value="/product/productList?searchCondition=Accessory" />"
                       role="button">
                        <img class="img-circle" src="<c:url value="/resources/images/MenWomenBrowse.PNG" />" alt="Instrument
                Image" width="140" height="140"></a>

                    <h2>SportsWear</h2>
                    <p>Men & Women sportswear collection.</p>

                </div><!-- /.col-lg-4 -->


            </div><!-- /.row -->

            <%@include file="/WEB-INF/views/template/footer.jsp" %>

