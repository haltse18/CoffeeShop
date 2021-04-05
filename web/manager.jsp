<%-- 
    Document   : manager
    Created on : Jan 16, 2021, 4:42:47 PM
    Author     : Luong Thanh Ha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html
    class="supports-js supports-svg supports-supports supports-placeholder supports-no-touchevents supports-csstransforms supports-csstransforms3d"
    lang="en" style="">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="google-signin-client_id" content="870337553536-vbjn7gf7fjchbtbnou42m3c3u7hknuuc.apps.googleusercontent.com">
        <script src="https://apis.google.com/js/platform.js" async defer></script>
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width,initial-scale=1">
        <meta name="theme-color" content="">
        <link rel="canonical" href="https://simpletheme-light.myshopify.com/collections/accessories">
        <link rel="shortcut icon" href="img/logo.jpeg" type="image/jpg">

        <title>
            Home
        </title>

        <meta property="og:site_name" content="Simple">
        <meta property="og:url" content="https://simpletheme-light.myshopify.com/collections/accessories">
        <meta property="og:title" content="Accessories">
        <meta property="og:type" content="product.group">
        <meta property="og:description" content="Demo store for the Simple ecommerce theme by and for Shopify">

        <meta name="twitter:site" content="@shopify">
        <meta name="twitter:card" content="summary_large_image">
        <meta name="twitter:title" content="Accessories">
        <meta name="twitter:description" content="Demo store for the Simple ecommerce theme by and for Shopify">

        <script type="text/javascript" async=""
        src="css/s/javascripts/tricorder/trekkie.storefront.min.js?v=2020.07.13.1"></script>
        <link href="css/s/files/t2assets/theme.scss.css" rel="stylesheet" type="text/css" media="all">
        <meta id="shopify-digital-wallet" name="shopify-digital-wallet"
              content="/26208075798/digital_wallets/dialog">
        <link rel="alternate" type="application/atom+xml" title="Feed" href="/collections/accessories.atom">
        <link rel="next" href="/collections/accessories?page=2">
        <link rel="alternate" type="application/json+oembed"
              href="https://simpletheme-light.myshopify.com/collections/accessories.oembed">
        <link href="https://monorail-edge.shopifysvc.com" rel="dns-prefetch">

        <script async=""
        src="css/s/assets/shop_events_listener-d81deda6557a113fbcc6a993184828adcef6f241e4ca52b6a21169cb03169317.js"></script>
        <script integrity="sha256-GkS6D0JfVvFoaxmvX+T8Owz974xJVdRRDQbxbJf9Nmg="
                data-source-attribution="shopify.loadfeatures" defer="defer"
                src="css/s/assets/storefront/load_feature-1a44ba0f425f56f1686b19af5fe4fc3b0cfdef8c4955d4510d06f16c97fd3668.js"
        crossorigin="anonymous"></script>
        <script integrity="sha256-h+g5mYiIAULyxidxudjy/2wpCz/3Rd1CbrDf4NudHa4="
                data-source-attribution="shopify.dynamic-checkout" defer="defer"
                src="css/s/assets/storefront/features-87e8399988880142f2c62771b9d8f2ff6c290b3ff745dd426eb0dfe0db9d1dae.js"
        crossorigin="anonymous"></script>

        <script src="css/s/files/t2assets/jquery-1.11.0.min.js?v=3246042684083249002"
        type="text/javascript"></script>
        <script src="css/s/files/t2assets/modernizr.min.js?v=4404443942060959132"
        type="text/javascript"></script>

        <script src="css/s/files/t2assets/lazysizes.min.js?v=15522312340271661705" async="async"></script>

        <meta property="og:image"
              content="css/s/files/1/0262/0807/5798/files/logo.png?height=628&amp;pad_color=fff&amp;v=1588362785&amp;width=1200">
        <meta property="og:image:secure_url"
              content="css/s/files/1/0262/0807/5798/files/logo.png?height=628&amp;pad_color=fff&amp;v=1588362785&amp;width=1200">
        <meta property="og:image:width" content="1200">
        <meta property="og:image:height" content="628">
        <script type="module" defer=""
        src="css/shopifycloud/consent-tracking-api/v0.1/consent-tracking-api.js"></script>
        <script src="chrome-extension://mooikfkahbdckldjjndioackbalphokd/assets/prompt.js"></script>
        <link href="css/shopifycloud/boomerang/shopify-boomerang-1.0.0.min.js" rel="preload" as="script">
        <script id="boomr-scr-as" src="css/shopifycloud/boomerang/shopify-boomerang-1.0.0.min.js"
        async=""></script>
        <script>

            function signOut() {
                gapi.auth2.getAuthInstance().signOut().then(function () {
                    console.log('User signed out.');
                });
                var redirectUrl = 'MainController';
                console.log('logout')
                //using jquery to post data dynamically
                var form = $('<form action="' + redirectUrl + '" method="get">' +
                        '<input type="submit" name="btnAction" value="View Cart"/>' +
                        '</form>');
                $('body').append(form);
                form.submit();

            }
        </script>


    </head>
    <body id="accessories" class="template-collection">

        <a class="in-page-link visually-hidden skip-link" href="#MainContent">Skip to content</a>

        <div id="shopify-section-header" class="shopify-section">

            <style>
                .site-header__logo {
                    width: 50px;
                }

                #HeaderLogoWrapper {
                    max-width: 150px !important;
                }
            </style>
            <div class="page-border"></div>


            <div class="site-wrapper">
                <div class="top-bar grid">

                    <div class="grid__item medium-up--one-fifth small--one-half">
                        <div class="top-bar__search">
                            <a href="MainController?btnAction=Search&txtSearchValue=" class="medium-up--hide">
                                <svg aria-hidden="true" focusable="false" role="presentation"
                                     class="icon icon-search" viewBox="0 0 20 20">
                                <path fill="#444"
                                      d="M18.64 17.02l-5.31-5.31c.81-1.08 1.26-2.43 1.26-3.87C14.5 4.06 11.44 1 7.75 1S1 4.06 1 7.75s3.06 6.75 6.75 6.75c1.44 0 2.79-.45 3.87-1.26l5.31 5.31c.45.45 1.26.54 1.71.09.45-.36.45-1.17 0-1.62zM3.25 7.75c0-2.52 1.98-4.5 4.5-4.5s4.5 1.98 4.5 4.5-1.98 4.5-4.5 4.5-4.5-1.98-4.5-4.5z">
                                </path>
                                </svg>
                            </a>
                            <form action="MainController" method="GET" class="search-bar small--hide"
                                  role="search">
                                <button type="submit" name="btnAction" value="SearchName"
                                        class="search-bar__submit">
                                    <svg aria-hidden="true" focusable="false" role="presentation"
                                         class="icon icon-search" viewBox="0 0 20 20">
                                    <path fill="#444"
                                          d="M18.64 17.02l-5.31-5.31c.81-1.08 1.26-2.43 1.26-3.87C14.5 4.06 11.44 1 7.75 1S1 4.06 1 7.75s3.06 6.75 6.75 6.75c1.44 0 2.79-.45 3.87-1.26l5.31 5.31c.45.45 1.26.54 1.71.09.45-.36.45-1.17 0-1.62zM3.25 7.75c0-2.52 1.98-4.5 4.5-4.5s4.5 1.98 4.5 4.5-1.98 4.5-4.5 4.5-4.5-1.98-4.5-4.5z">
                                    </path>
                                    </svg>
                                    <span class="icon__fallback-text">Search</span>
                                </button>
                                <input type="text" name="txtSearchValue" class="search-bar__input" value="${param.txtSearchValue}"
                                       placeholder="Search" aria-label="Search">
                            </form>
                        </div>
                    </div>
                    <!--                    <div class="grid__item  medium-up--four-fifths  small--one-half text-right">
                                            <a href="MainController?btnAction=View Cart" class="site-header__cart">
                                                <svg aria-hidden="true" focusable="false" role="presentation" class="icon icon-cart" viewBox="0 0 20 20">
                                                <path fill="#444"
                                                      d="M18.936 5.564c-.144-.175-.35-.207-.55-.207h-.003L6.774 4.286c-.272 0-.417.089-.491.18-.079.096-.16.263-.094.585l2.016 5.705c.163.407.642.673 1.068.673h8.401c.433 0 .854-.285.941-.725l.484-4.571c.045-.221-.015-.388-.163-.567z">
                                                </path>
                                                <path fill="#444"
                                                      d="M17.107 12.5H7.659L4.98 4.117l-.362-1.059c-.138-.401-.292-.559-.695-.559H.924c-.411 0-.748.303-.748.714s.337.714.748.714h2.413l3.002 9.48c.126.38.295.52.942.52h9.825c.411 0 .748-.303.748-.714s-.336-.714-.748-.714zM10.424 16.23a1.498 1.498 0 1 1-2.997 0 1.498 1.498 0 0 1 2.997 0zM16.853 16.23a1.498 1.498 0 1 1-2.997 0 1.498 1.498 0 0 1 2.997 0z">
                                                </path>
                                                </svg>
                                                <span class="small--hide">
                                                    Cart
                                                    (<span id="CartCount" >
                    <c:if test="${not empty sessionScope.CARTCOUNT}">
                        ${sessionScope.CARTCOUNT}
                    </c:if>
                    <c:if test="${empty sessionScope.CARTCOUNT}">
                        0
                    </c:if></span>)
            </span>
        </a>
    </div>-->



                </div>

                <hr class="small--hide hr--border">

                <header class="site-header grid medium-up--grid--table" role="banner">
                    <div class="grid__item small--text-center">
                        <div itemscope="" itemtype="http://schema.org/Organization">


                            <div id="HeaderLogoWrapper" class="supports-js">
                                <a href="MainController?btnAction=Search&txtSearchValue=" itemprop="url"
                                   style="padding-bottom:30.30888030888031%; display: block;">
                                    <img id="HeaderLogo" class="lazyautosizes lazyloaded" src="img/logo.jpeg"
                                         height="px">
                                </a>
                            </div>



                        </div>

                    </div>
                    <form action="MainController" method="POST">
                        <div style="width: 150px; display: inherit;margin-right: 40px; ">
                            <c:if test="${not empty sessionScope.USERINFO}">

                                ${sessionScope.USERINFO.firstname}   |
                                <br/>
                                <a href="MainController?btnAction=Logout">
                                    Logout
                                </a><br/>
                                <button
                                    style="margin:10px; background-color: white; border: 2px solid black; color: black;width:170px;margin-left:65px"
                                    name="btnAction" value="createPage" class="btn">                                                

                                    <span id="createProduct">Create product</span>
                                </button>
                            </c:if>

                        </div>
                    </form>
                </header>
            </div>

        </div>



        <div class="site-wrapper">

            <div class="grid">

                <div id="shopify-section-sidebar" class="shopify-section">
                    <div data-section-id="sidebar" data-section-type="sidebar-section">
                        <nav class="grid__item small--text-center medium-up--one-fifth" role="navigation">
                            <hr class="hr--small medium-up--hide">
                            <button id="ToggleMobileMenu" class="mobile-menu-icon medium-up--hide"
                                    aria-haspopup="true" aria-owns="SiteNav">
                                <span class="line"></span>
                                <span class="line"></span>
                                <span class="line"></span>
                                <span class="line"></span>
                                <span class="icon__fallback-text">Menu</span>
                            </button>
                            <div id="SiteNav" class="site-nav" role="menu">
                                <ul class="list--nav">

                                    <li class="site-nav__item">
                                        <a href="MainController?btnAction=Search&txtSearchValue="
                                           class="site-nav__link">Home</a>
                                    </li>

                                    <c:set var="category" value="${sessionScope.CATEGORIES}"/>
                                    <c:if test="${not empty category}">
                                        <c:set var="categoryIdSet" value="${category.keySet()}"/>
                                        <c:forEach var="categoryId" items="${categoryIdSet}" >
                                            <li class="site-nav__item">
                                                <input type="hidden" value="${categoryId}" />
                                                <a href="MainController?btnAction=SearchByCategory&CateId=${categoryId}" class="site-nav__link">${category.get(categoryId)}</a>
                                            </li>  
                                        </c:forEach>
                                    </c:if>
                                    <%-- <c:if test="${empty category}">
                                         <jsp:forward page="MainController?btnAction="/>
                                         
                                     </c:if>
                                    --%>






                                </ul>
                                <ul class="list--inline social-links">

                                    <li>
                                        <a href="https://www.facebook.com/icancoffee/"
                                           title="Simple on Facebook">
                                            <svg aria-hidden="true" focusable="false" role="presentation"
                                                 class="icon icon-facebook" viewBox="0 0 20 20">
                                            <path fill="#444"
                                                  d="M18.05.811q.439 0 .744.305t.305.744v16.637q0 .439-.305.744t-.744.305h-4.732v-7.221h2.415l.342-2.854h-2.757v-1.83q0-.659.293-1t1.073-.342h1.488V3.762q-.976-.098-2.171-.098-1.634 0-2.635.964t-1 2.72V9.47H7.951v2.854h2.415v7.221H1.413q-.439 0-.744-.305t-.305-.744V1.859q0-.439.305-.744T1.413.81H18.05z">
                                            </path>
                                            </svg>
                                            <span class="icon__fallback-text">Facebook</span>
                                        </a>
                                    </li>


                                    <li>
                                        <a href="https://www.instagram.com/icancoffee_vn/"
                                           title="Simple on Instagram">
                                            <svg aria-hidden="true" focusable="false" role="presentation"
                                                 class="icon icon-instagram" viewBox="0 0 512 512">
                                            <path
                                                d="M256 49.5c67.3 0 75.2.3 101.8 1.5 24.6 1.1 37.9 5.2 46.8 8.7 11.8 4.6 20.2 10 29 18.8s14.3 17.2 18.8 29c3.4 8.9 7.6 22.2 8.7 46.8 1.2 26.6 1.5 34.5 1.5 101.8s-.3 75.2-1.5 101.8c-1.1 24.6-5.2 37.9-8.7 46.8-4.6 11.8-10 20.2-18.8 29s-17.2 14.3-29 18.8c-8.9 3.4-22.2 7.6-46.8 8.7-26.6 1.2-34.5 1.5-101.8 1.5s-75.2-.3-101.8-1.5c-24.6-1.1-37.9-5.2-46.8-8.7-11.8-4.6-20.2-10-29-18.8s-14.3-17.2-18.8-29c-3.4-8.9-7.6-22.2-8.7-46.8-1.2-26.6-1.5-34.5-1.5-101.8s.3-75.2 1.5-101.8c1.1-24.6 5.2-37.9 8.7-46.8 4.6-11.8 10-20.2 18.8-29s17.2-14.3 29-18.8c8.9-3.4 22.2-7.6 46.8-8.7 26.6-1.3 34.5-1.5 101.8-1.5m0-45.4c-68.4 0-77 .3-103.9 1.5C125.3 6.8 107 11.1 91 17.3c-16.6 6.4-30.6 15.1-44.6 29.1-14 14-22.6 28.1-29.1 44.6-6.2 16-10.5 34.3-11.7 61.2C4.4 179 4.1 187.6 4.1 256s.3 77 1.5 103.9c1.2 26.8 5.5 45.1 11.7 61.2 6.4 16.6 15.1 30.6 29.1 44.6 14 14 28.1 22.6 44.6 29.1 16 6.2 34.3 10.5 61.2 11.7 26.9 1.2 35.4 1.5 103.9 1.5s77-.3 103.9-1.5c26.8-1.2 45.1-5.5 61.2-11.7 16.6-6.4 30.6-15.1 44.6-29.1 14-14 22.6-28.1 29.1-44.6 6.2-16 10.5-34.3 11.7-61.2 1.2-26.9 1.5-35.4 1.5-103.9s-.3-77-1.5-103.9c-1.2-26.8-5.5-45.1-11.7-61.2-6.4-16.6-15.1-30.6-29.1-44.6-14-14-28.1-22.6-44.6-29.1-16-6.2-34.3-10.5-61.2-11.7-27-1.1-35.6-1.4-104-1.4z">
                                            </path>
                                            <path
                                                d="M256 126.6c-71.4 0-129.4 57.9-129.4 129.4s58 129.4 129.4 129.4 129.4-58 129.4-129.4-58-129.4-129.4-129.4zm0 213.4c-46.4 0-84-37.6-84-84s37.6-84 84-84 84 37.6 84 84-37.6 84-84 84z">
                                            </path>
                                            <circle cx="390.5" cy="121.5" r="30.2"></circle>
                                            </svg>
                                            <span class="icon__fallback-text">Instagram</span>
                                        </a>
                                    </li>

                                </ul>
                            </div>

                        </nav>
                    </div>

                </div>



                <main class="main-content grid__item medium-up--four-fifths" id="MainContent" role="main">

                    <hr class="hr--border-top small--hide">
                    <nav class="breadcrumb-nav small--text-center" aria-label="You are here">
                        <span itemscope="" itemtype="http://schema.org/BreadcrumbList">
                            <span itemprop="itemListElement" itemscope="" itemtype="http://schema.org/ListItem">
                                <a href="MainController?btnAction=Search&txtSearchValue=" itemprop="item"
                                   title="Back to the frontpage">
                                    <span itemprop="name">Home</span>
                                </a>
                                <span itemprop="position" hidden="">1</span>
                            </span>
                            <span class="breadcrumb-nav__separator" aria-hidden="true">›</span>


                            <span itemprop="itemListElement" itemscope="" itemtype="http://schema.org/ListItem">
                                <span itemprop="name">Product</span>
                                <span itemprop="position" hidden="">2</span>
                            </span>


                        </span>
                    </nav>


                    <!-- /templates/collection.liquid -->


                    <div id="shopify-section-collection-template" class="shopify-section">
                        <!-- /templates/collection.liquid -->
                        <header class="grid">
                            <h1 class="grid__item small--text-center medium-up--one-third">Product</h1>


                            <div class="collection-sorting grid__item medium-up--two-thirds medium-up--text-right small--text-center">

                                +


                                <form action="MainController">
                                    <input style="width: 80px;margin-left: 10px" type="number" name="priceFrom" min="10000" value="20000" pattern="[0-9]">đ to <input style="width: 80px" type="number" name="priceTo" min="30000" value="50000" pattern="[0-9]" >đ
                                    <button  style="width: 100px" type="submit" name="btnAction" value="Search Price" class="btn">
                                        <span id="Filter">Search</span>
                                    </button><br/><br/>
                                    <!--                                    <button
                                                                            style="margin:10px; background-color: white; border: 2px solid black; color: black;width:170px;margin-left:65px"
                                                                            name="btnAction" value="createPage" class="btn">                                                
                                                                            <input type="hidden" name="purpose" value="manage" />
                                                                            <span id="createProduct">Create product</span>
                                                                        </button>-->
                                </form>

                            </div>
                        </header>
                        <form action="MainController" enctype = "multipart/form-data" method="POST">
                            <div data-section-id="collection-template" data-section-type="collection-template"
                                 data-sort-enabled="true" data-tags-enabled="false">


                                <div class="grid grid--uniform" role="list">


                                    <c:set var="productList" value="${sessionScope.PRODUCTLIST}" />
                                    <c:if test="${not empty productList}">
                                        <c:forEach var="dto" items="${productList}">

                                            <div class="product grid__item medium-up--one-third small--one-half slide-up-animation animated"
                                                 role="listitem">

                                                <div class="supports-js" style="max-width: 600px; margin: 0 auto;">
                                                    <a class="product__image-wrapper" style="padding-top:100.0%;"
                                                       title="${dto.productName}" data-image-link="" href="MainController?btnAction=showProduct&productId=${dto.productId}">
                                                        <img class="product__image lazyautosizes lazyloaded" alt="${dto.productName}"
                                                             style="max-width: 280px; max-height: 600px;"
                                                             data-widths="[180, 360, 540, 720, 900, 1080, 1296, 1512, 1728, 2048]"
                                                             data-aspectratio="1.0" data-sizes="auto" data-image=""
                                                             sizes="303px" src="data:image/png;base64,${dto.image}" height="303px">
                                                    </a>
                                                </div>

                                                <noscript>
                                                <a href="MainController?btnAction=showProduct&productId=${dto.productId}" class="product__image-wrapper"
                                                   title="${dto.productName}">
                                                    <img src="data:image/png;base64,${dto.image}" alt="${dto.productName}">
                                                </a>
                                                </noscript>

                                                <div class="product__title product__title--card text-center">
                                                    <a href="product.jsp" style="font-style: oblique;">${dto.productName}</a>
                                                </div>

                                                <div class="product__prices text-center">
                                                    <span class="product__price">
                                                        <span class="visually-hidden">Regular price</span> ${dto.modifyPrice(dto.price)}
                                                    </span>
                                                </div>


                                                <form action="MainController">
                                                    <input type="hidden" name="txtProductID" value="${dto.productId}" />   
                                                    <button
                                                        style="margin:10px; background-color: white; border: 2px solid black; color: black;width:170px;margin-left:65px"
                                                        name="btnAction" value="Update" class="btn">                                                

                                                        <span id="updateProduct">Update product</span>
                                                    </button>
                                                </form>






                                            </div>

                                        </c:forEach><br/>
                                        
                                        <span>Page:</span>
                                        <c:set var="pageNum" value="${sessionScope.PAGENUMBER}"/>
                                        <c:forEach begin="1" end="${pageNum}" var="page">
                                            <a href="MainController?btnAction=SearchName&txtSearchValue=${param.txtSearchValue}&pageNumber=${page}" class="btn">
                                                ${page}</a>
                                            </c:forEach>
                                        </c:if>


                                    <c:if test="${empty productList}">
                                        <font color="grey"> No Product found </font>
                                    </c:if>

                                </div>
                            </div>
                        </form>
                    </div>
                </main>
            </div>
    </body>
</html>
