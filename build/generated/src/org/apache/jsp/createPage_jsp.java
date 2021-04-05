package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class createPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html\n");
      out.write("    class=\"supports-js supports-svg supports-supports supports-placeholder supports-no-touchevents supports-csstransforms supports-csstransforms3d\"\n");
      out.write("    lang=\"en\" style=\"\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,initial-scale=1\">\n");
      out.write("        <meta name=\"theme-color\" content=\"\">\n");
      out.write("        <link rel=\"canonical\" href=\"https://simpletheme-light.myshopify.com/collections/accessories\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"img/logo.jpeg\" type=\"image/jpg\">\n");
      out.write("\n");
      out.write("        <title>\n");
      out.write("            Home\n");
      out.write("        </title>\n");
      out.write("\n");
      out.write("        <meta property=\"og:site_name\" content=\"Simple\">\n");
      out.write("        <meta property=\"og:url\" content=\"https://simpletheme-light.myshopify.com/collections/accessories\">\n");
      out.write("        <meta property=\"og:title\" content=\"Accessories\">\n");
      out.write("        <meta property=\"og:type\" content=\"product.group\">\n");
      out.write("        <meta property=\"og:description\" content=\"Demo store for the Simple ecommerce theme by and for Shopify\">\n");
      out.write("\n");
      out.write("        <meta name=\"twitter:site\" content=\"@shopify\">\n");
      out.write("        <meta name=\"twitter:card\" content=\"summary_large_image\">\n");
      out.write("        <meta name=\"twitter:title\" content=\"Accessories\">\n");
      out.write("        <meta name=\"twitter:description\" content=\"Demo store for the Simple ecommerce theme by and for Shopify\">\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" async=\"\"\n");
      out.write("        src=\"css/s/javascripts/tricorder/trekkie.storefront.min.js?v=2020.07.13.1\"></script>\n");
      out.write("        <link href=\"css/s/files/t2assets/theme.scss.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("        <meta id=\"shopify-digital-wallet\" name=\"shopify-digital-wallet\"\n");
      out.write("              content=\"/26208075798/digital_wallets/dialog\">\n");
      out.write("        <link rel=\"alternate\" type=\"application/atom+xml\" title=\"Feed\" href=\"/collections/accessories.atom\">\n");
      out.write("        <link rel=\"next\" href=\"/collections/accessories?page=2\">\n");
      out.write("        <link rel=\"alternate\" type=\"application/json+oembed\"\n");
      out.write("              href=\"https://simpletheme-light.myshopify.com/collections/accessories.oembed\">\n");
      out.write("        <link href=\"https://monorail-edge.shopifysvc.com\" rel=\"dns-prefetch\">\n");
      out.write("\n");
      out.write("        <script async=\"\"\n");
      out.write("        src=\"css/s/assets/shop_events_listener-d81deda6557a113fbcc6a993184828adcef6f241e4ca52b6a21169cb03169317.js\"></script>\n");
      out.write("        <script integrity=\"sha256-GkS6D0JfVvFoaxmvX+T8Owz974xJVdRRDQbxbJf9Nmg=\"\n");
      out.write("                data-source-attribution=\"shopify.loadfeatures\" defer=\"defer\"\n");
      out.write("                src=\"css/s/assets/storefront/load_feature-1a44ba0f425f56f1686b19af5fe4fc3b0cfdef8c4955d4510d06f16c97fd3668.js\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("        <script integrity=\"sha256-h+g5mYiIAULyxidxudjy/2wpCz/3Rd1CbrDf4NudHa4=\"\n");
      out.write("                data-source-attribution=\"shopify.dynamic-checkout\" defer=\"defer\"\n");
      out.write("                src=\"css/s/assets/storefront/features-87e8399988880142f2c62771b9d8f2ff6c290b3ff745dd426eb0dfe0db9d1dae.js\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"css/s/files/t2assets/jquery-1.11.0.min.js?v=3246042684083249002\"\n");
      out.write("        type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"css/s/files/t2assets/modernizr.min.js?v=4404443942060959132\"\n");
      out.write("        type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"css/s/files/t2assets/lazysizes.min.js?v=15522312340271661705\" async=\"async\"></script>\n");
      out.write("\n");
      out.write("        <meta property=\"og:image\"\n");
      out.write("              content=\"css/s/files/1/0262/0807/5798/files/logo.png?height=628&amp;pad_color=fff&amp;v=1588362785&amp;width=1200\">\n");
      out.write("        <meta property=\"og:image:secure_url\"\n");
      out.write("              content=\"css/s/files/1/0262/0807/5798/files/logo.png?height=628&amp;pad_color=fff&amp;v=1588362785&amp;width=1200\">\n");
      out.write("        <meta property=\"og:image:width\" content=\"1200\">\n");
      out.write("        <meta property=\"og:image:height\" content=\"628\">\n");
      out.write("        <script type=\"module\" defer=\"\"\n");
      out.write("        src=\"css/shopifycloud/consent-tracking-api/v0.1/consent-tracking-api.js\"></script>\n");
      out.write("        <script src=\"chrome-extension://mooikfkahbdckldjjndioackbalphokd/assets/prompt.js\"></script>\n");
      out.write("        <link href=\"css/shopifycloud/boomerang/shopify-boomerang-1.0.0.min.js\" rel=\"preload\" as=\"script\">\n");
      out.write("        <script id=\"boomr-scr-as\" src=\"css/shopifycloud/boomerang/shopify-boomerang-1.0.0.min.js\"\n");
      out.write("        async=\"\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body id=\"accessories\" class=\"template-collection\">\n");
      out.write("\n");
      out.write("        <a class=\"in-page-link visually-hidden skip-link\" href=\"#MainContent\">Skip to content</a>\n");
      out.write("\n");
      out.write("        <div id=\"shopify-section-header\" class=\"shopify-section\">\n");
      out.write("\n");
      out.write("            <style>\n");
      out.write("                .site-header__logo {\n");
      out.write("                    width: 50px;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                #HeaderLogoWrapper {\n");
      out.write("                    max-width: 150px !important;\n");
      out.write("                }\n");
      out.write("            </style>\n");
      out.write("            <div class=\"page-border\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"site-wrapper\">\n");
      out.write("                <div class=\"top-bar grid\">\n");
      out.write("\n");
      out.write("                    <div class=\"grid__item medium-up--one-fifth small--one-half\">\n");
      out.write("                        <div class=\"top-bar__search\">\n");
      out.write("                            <a href=\"MainController?btnAction=Search&txtSearchValue=\" class=\"medium-up--hide\">\n");
      out.write("                                <svg aria-hidden=\"true\" focusable=\"false\" role=\"presentation\"\n");
      out.write("                                     class=\"icon icon-search\" viewBox=\"0 0 20 20\">\n");
      out.write("                                <path fill=\"#444\"\n");
      out.write("                                      d=\"M18.64 17.02l-5.31-5.31c.81-1.08 1.26-2.43 1.26-3.87C14.5 4.06 11.44 1 7.75 1S1 4.06 1 7.75s3.06 6.75 6.75 6.75c1.44 0 2.79-.45 3.87-1.26l5.31 5.31c.45.45 1.26.54 1.71.09.45-.36.45-1.17 0-1.62zM3.25 7.75c0-2.52 1.98-4.5 4.5-4.5s4.5 1.98 4.5 4.5-1.98 4.5-4.5 4.5-4.5-1.98-4.5-4.5z\">\n");
      out.write("                                </path>\n");
      out.write("                                </svg>\n");
      out.write("                            </a>\n");
      out.write("                            <form action=\"MainController\" method=\"GET\" class=\"search-bar small--hide\"\n");
      out.write("                                  role=\"search\">\n");
      out.write("                                <button type=\"submit\" name=\"btnAction\" value=\"Search by name\"\n");
      out.write("                                        class=\"search-bar__submit\">\n");
      out.write("                                    <svg aria-hidden=\"true\" focusable=\"false\" role=\"presentation\"\n");
      out.write("                                         class=\"icon icon-search\" viewBox=\"0 0 20 20\">\n");
      out.write("                                    <path fill=\"#444\"\n");
      out.write("                                          d=\"M18.64 17.02l-5.31-5.31c.81-1.08 1.26-2.43 1.26-3.87C14.5 4.06 11.44 1 7.75 1S1 4.06 1 7.75s3.06 6.75 6.75 6.75c1.44 0 2.79-.45 3.87-1.26l5.31 5.31c.45.45 1.26.54 1.71.09.45-.36.45-1.17 0-1.62zM3.25 7.75c0-2.52 1.98-4.5 4.5-4.5s4.5 1.98 4.5 4.5-1.98 4.5-4.5 4.5-4.5-1.98-4.5-4.5z\">\n");
      out.write("                                    </path>\n");
      out.write("                                    </svg>\n");
      out.write("                                    <span class=\"icon__fallback-text\">Search</span>\n");
      out.write("                                </button>\n");
      out.write("                                <input type=\"text\" name=\"txtSearchValue\" class=\"search-bar__input\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtSearchValue}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("                                       placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <hr class=\"small--hide hr--border\">\n");
      out.write("\n");
      out.write("                <header class=\"site-header grid medium-up--grid--table\" role=\"banner\">\n");
      out.write("                    <div class=\"grid__item small--text-center\">\n");
      out.write("                        <div itemscope=\"\" itemtype=\"http://schema.org/Organization\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div id=\"HeaderLogoWrapper\" class=\"supports-js\">\n");
      out.write("                                <a href=\"MainController?btnAction=Search&txtSearchValue=\" itemprop=\"url\"\n");
      out.write("                                   style=\"padding-bottom:30.30888030888031%; display: block;\">\n");
      out.write("                                    <img id=\"HeaderLogo\" class=\"lazyautosizes lazyloaded\" src=\"img/logo.jpeg\"\n");
      out.write("                                         height=\"px\">\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <form action=\"MainController\" method=\"POST\">\n");
      out.write("                        <div style=\"width: 150px; display: inherit;margin-right: 40px; \">\n");
      out.write("                            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </header>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"site-wrapper\">\n");
      out.write("\n");
      out.write("            <div class=\"grid\">\n");
      out.write("\n");
      out.write("                <div id=\"shopify-section-sidebar\" class=\"shopify-section\">\n");
      out.write("                    <div data-section-id=\"sidebar\" data-section-type=\"sidebar-section\">\n");
      out.write("                        <nav class=\"grid__item small--text-center medium-up--one-fifth\" role=\"navigation\">\n");
      out.write("                            <hr class=\"hr--small medium-up--hide\">\n");
      out.write("                            <button id=\"ToggleMobileMenu\" class=\"mobile-menu-icon medium-up--hide\"\n");
      out.write("                                    aria-haspopup=\"true\" aria-owns=\"SiteNav\">\n");
      out.write("                                <span class=\"line\"></span>\n");
      out.write("                                <span class=\"line\"></span>\n");
      out.write("                                <span class=\"line\"></span>\n");
      out.write("                                <span class=\"line\"></span>\n");
      out.write("                                <span class=\"icon__fallback-text\">Menu</span>\n");
      out.write("                            </button>\n");
      out.write("                            <div id=\"SiteNav\" class=\"site-nav\" role=\"menu\">\n");
      out.write("                                <ul class=\"list--nav\">\n");
      out.write("\n");
      out.write("                                    <li class=\"site-nav__item\">\n");
      out.write("                                        <a href=\"MainController?btnAction=Search&txtSearchValue=\"\n");
      out.write("                                           class=\"site-nav__link\">Home</a>\n");
      out.write("                                    </li>\n");
      out.write("\n");
      out.write("                                    ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("                                <ul class=\"list--inline social-links\">\n");
      out.write("\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"https://www.facebook.com/icancoffee/\"\n");
      out.write("                                           title=\"Simple on Facebook\">\n");
      out.write("                                            <svg aria-hidden=\"true\" focusable=\"false\" role=\"presentation\"\n");
      out.write("                                                 class=\"icon icon-facebook\" viewBox=\"0 0 20 20\">\n");
      out.write("                                            <path fill=\"#444\"\n");
      out.write("                                                  d=\"M18.05.811q.439 0 .744.305t.305.744v16.637q0 .439-.305.744t-.744.305h-4.732v-7.221h2.415l.342-2.854h-2.757v-1.83q0-.659.293-1t1.073-.342h1.488V3.762q-.976-.098-2.171-.098-1.634 0-2.635.964t-1 2.72V9.47H7.951v2.854h2.415v7.221H1.413q-.439 0-.744-.305t-.305-.744V1.859q0-.439.305-.744T1.413.81H18.05z\">\n");
      out.write("                                            </path>\n");
      out.write("                                            </svg>\n");
      out.write("                                            <span class=\"icon__fallback-text\">Facebook</span>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"https://www.instagram.com/icancoffee_vn/\"\n");
      out.write("                                           title=\"Simple on Instagram\">\n");
      out.write("                                            <svg aria-hidden=\"true\" focusable=\"false\" role=\"presentation\"\n");
      out.write("                                                 class=\"icon icon-instagram\" viewBox=\"0 0 512 512\">\n");
      out.write("                                            <path\n");
      out.write("                                                d=\"M256 49.5c67.3 0 75.2.3 101.8 1.5 24.6 1.1 37.9 5.2 46.8 8.7 11.8 4.6 20.2 10 29 18.8s14.3 17.2 18.8 29c3.4 8.9 7.6 22.2 8.7 46.8 1.2 26.6 1.5 34.5 1.5 101.8s-.3 75.2-1.5 101.8c-1.1 24.6-5.2 37.9-8.7 46.8-4.6 11.8-10 20.2-18.8 29s-17.2 14.3-29 18.8c-8.9 3.4-22.2 7.6-46.8 8.7-26.6 1.2-34.5 1.5-101.8 1.5s-75.2-.3-101.8-1.5c-24.6-1.1-37.9-5.2-46.8-8.7-11.8-4.6-20.2-10-29-18.8s-14.3-17.2-18.8-29c-3.4-8.9-7.6-22.2-8.7-46.8-1.2-26.6-1.5-34.5-1.5-101.8s.3-75.2 1.5-101.8c1.1-24.6 5.2-37.9 8.7-46.8 4.6-11.8 10-20.2 18.8-29s17.2-14.3 29-18.8c8.9-3.4 22.2-7.6 46.8-8.7 26.6-1.3 34.5-1.5 101.8-1.5m0-45.4c-68.4 0-77 .3-103.9 1.5C125.3 6.8 107 11.1 91 17.3c-16.6 6.4-30.6 15.1-44.6 29.1-14 14-22.6 28.1-29.1 44.6-6.2 16-10.5 34.3-11.7 61.2C4.4 179 4.1 187.6 4.1 256s.3 77 1.5 103.9c1.2 26.8 5.5 45.1 11.7 61.2 6.4 16.6 15.1 30.6 29.1 44.6 14 14 28.1 22.6 44.6 29.1 16 6.2 34.3 10.5 61.2 11.7 26.9 1.2 35.4 1.5 103.9 1.5s77-.3 103.9-1.5c26.8-1.2 45.1-5.5 61.2-11.7 16.6-6.4 30.6-15.1 44.6-29.1 14-14 22.6-28.1 29.1-44.6 6.2-16 10.5-34.3 11.7-61.2 1.2-26.9 1.5-35.4 1.5-103.9s-.3-77-1.5-103.9c-1.2-26.8-5.5-45.1-11.7-61.2-6.4-16.6-15.1-30.6-29.1-44.6-14-14-28.1-22.6-44.6-29.1-16-6.2-34.3-10.5-61.2-11.7-27-1.1-35.6-1.4-104-1.4z\">\n");
      out.write("                                            </path>\n");
      out.write("                                            <path\n");
      out.write("                                                d=\"M256 126.6c-71.4 0-129.4 57.9-129.4 129.4s58 129.4 129.4 129.4 129.4-58 129.4-129.4-58-129.4-129.4-129.4zm0 213.4c-46.4 0-84-37.6-84-84s37.6-84 84-84 84 37.6 84 84-37.6 84-84 84z\">\n");
      out.write("                                            </path>\n");
      out.write("                                            <circle cx=\"390.5\" cy=\"121.5\" r=\"30.2\"></circle>\n");
      out.write("                                            </svg>\n");
      out.write("                                            <span class=\"icon__fallback-text\">Instagram</span>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </nav>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <main class=\"main-content grid__item medium-up--four-fifths\" id=\"MainContent\" role=\"main\">\n");
      out.write("\n");
      out.write("                    <hr class=\"hr--border-top small--hide\">\n");
      out.write("                    <nav class=\"breadcrumb-nav small--text-center\" aria-label=\"You are here\">\n");
      out.write("                        <span itemscope=\"\" itemtype=\"http://schema.org/BreadcrumbList\">\n");
      out.write("                            <span itemprop=\"itemListElement\" itemscope=\"\" itemtype=\"http://schema.org/ListItem\">\n");
      out.write("                                <a href=\"MainController?btnAction=Search&txtSearchValue=\" itemprop=\"item\"\n");
      out.write("                                   title=\"Back to the frontpage\">\n");
      out.write("                                    <span itemprop=\"name\">Home</span>\n");
      out.write("                                </a>\n");
      out.write("                                <span itemprop=\"position\" hidden=\"\">1</span>\n");
      out.write("                            </span>\n");
      out.write("                            <span class=\"breadcrumb-nav__separator\" aria-hidden=\"true\">›</span>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <span itemprop=\"itemListElement\" itemscope=\"\" itemtype=\"http://schema.org/ListItem\">\n");
      out.write("                                <span itemprop=\"name\">Product</span>\n");
      out.write("                                <span itemprop=\"position\" hidden=\"\">2</span>\n");
      out.write("                            </span>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </span>\n");
      out.write("                    </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <!-- /templates/collection.liquid -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div id=\"shopify-section-collection-template\" class=\"shopify-section\">\n");
      out.write("                        <!-- /templates/collection.liquid -->\n");
      out.write("                        <header class=\"grid\">\n");
      out.write("                            <h1 class=\"grid__item small--text-center medium-up--one-third\">Product</h1>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"collection-sorting grid__item medium-up--two-thirds medium-up--text-right small--text-center\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                \n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </header>\n");
      out.write("\n");
      out.write("                        <div data-section-id=\"collection-template\" data-section-type=\"collection-template\"\n");
      out.write("                             data-sort-enabled=\"true\" data-tags-enabled=\"false\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"grid grid--uniform\" role=\"list\">\n");
      out.write("                                <form action=\"MainController\" enctype=\"multipart/form-data\" method=\"POST\" >\n");
      out.write("                                    <input type=\"hidden\" name=\"purpose\" value=\"create\" />\n");
      out.write("                                    Product ID  <input class=\"form-control\" type=\"text\" name=\"txtProductID\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtProductID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required=\"required\" pattern=\"[a-zA-Z0-9]{5}\" title=\"ex: CR001\"/>\n");
      out.write("\n");
      out.write("                                    Product Name  <input class=\"form-control\" type=\"text\" name=\"txtProductName\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtProductName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required=\"required\" pattern=\"[a-zA-Z]{1.20}\"\n");
      out.write("                                                         title=\"Cannot contains special symbols\"/>\n");
      out.write("                                    <br/><br/>\n");
      out.write("                                    Price  <input class=\"form-control\" type=\"number\" name=\"txtPrice\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" min=\"10000\" required=\"required\" />\n");
      out.write("                                    <div style=\"color: red\">\n");
      out.write("\n");
      out.write("                                    </div><br/>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    Quantity  <input class=\"form-control\" type=\"number\" name=\"txtQuantity\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtQuantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" min=\"1\" required=\"required\"/>\n");
      out.write("                                    <div style=\"color: red\">\n");
      out.write("\n");
      out.write("                                    </div><br/>\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                       \n");
      out.write("                                    <input type=\"file\" name=\"fileImage\" value=\"\" multiple=\"multiple\" id=\"image\" class=\"form-control\" required=\"true\"/>\n");
      out.write("                                    <br/><br/>\n");
      out.write("\n");
      out.write("                                    Category  <select class=\"form-select\" aria-label=\"Default select example\" name=\"cate\" required=\"true\">\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </select><br/><br/>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    Ingredient  <input class=\"form-control\" type=\"text\" name=\"txtIngredient\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtIngredient}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                                    <div style=\"color: red\">\n");
      out.write("\n");
      out.write("                                    </div></br>\n");
      out.write("                                    Description  <input class=\"form-control\" type=\"text\" name=\"txtDescription\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtDescription}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                                    <div style=\"color: red\">\n");
      out.write("\n");
      out.write("                                    </div></br>\n");
      out.write("\n");
      out.write("                                    <button\n");
      out.write("                                        style=\"margin:10px; background-color: white; border: 2px solid black; color: black;width:170px;margin-left:65px\"\n");
      out.write("                                        name=\"btnAction\" value=\"confirmCreate\" class=\"btn\">                                                \n");
      out.write("\n");
      out.write("                                        <span id=\"confirmCreate\">Create</span>\n");
      out.write("                                    </button>\n");
      out.write("                                </form>\t\t\t\t\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </main>\n");
      out.write("            </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty sessionScope.USERINFO}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\n");
        out.write("                                ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.USERINFO.firstname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("   |\n");
        out.write("                                <br/>\n");
        out.write("                                <a href=\"MainController?btnAction=Logout\">\n");
        out.write("                                    Logout\n");
        out.write("                                </a><br/>\n");
        out.write("                                <button\n");
        out.write("                                    style=\"margin:10px; background-color: white; border: 2px solid black; color: black;width:170px;margin-left:65px\"\n");
        out.write("                                    name=\"btnAction\" value=\"createPage\" class=\"btn\">                                                \n");
        out.write("\n");
        out.write("                                    <span id=\"createProduct\">Create product</span>\n");
        out.write("                                </button>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("category");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.CATEGORIES}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty category}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_c_set_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_set_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_set_1.setVar("categoryIdSet");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.keySet()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_forEach_0.setVar("categoryId");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${categoryIdSet}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <li class=\"site-nav__item\">\n");
          out.write("                                                <input type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${categoryId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" />\n");
          out.write("                                                <a href=\"MainController?btnAction=SearchByCategory&CateId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${categoryId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"site-nav__link\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.get(categoryId)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                                            </li>  \n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty requestScope.imageData}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <img style=\"width: 276px;\" src=\"data:image/png;base64,");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.imageData}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("categoryId");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${categoryIdSet}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${categoryId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.get(categoryId)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
