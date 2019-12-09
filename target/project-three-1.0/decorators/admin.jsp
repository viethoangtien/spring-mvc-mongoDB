<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/common/taglib.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title><dec:title default="Trang quản trị"/></title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <meta charset="utf-8"/>
    <meta name="description" content="Static &amp; Dynamic Tables"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0"/>
    <link href="<c:url value='/template/adminlte/bower-components/bootstrap/dist/css/bootstrap.min.css' />"
                                                               rel="stylesheet" type="text/css" media="all"/>
    <%--ADMIN ACE--%>
    <%--    <link href="<c:url value='/template/admin/font-awesome/4.5.0/css/font-awesome.min.css' />" rel="stylesheet"--%>
    <%--          type="text/css" media="all"/>--%>
    <%--    <link href="<c:url value='/template/admin/css/fonts.googleapis.com.css' />" rel="stylesheet" type="text/css"--%>
    <%--          media="all"/>--%>
    <%--          rel="stylesheet" type="text/css" media="all"/>--%>
    <%--ADMIN LTE--%>
    <!-- Bootstrap 3.3.7 -->
    <!-- Font Awesome -->
    <link href="<c:url value='/template/admin/css/ace.min.css' />" class="ace-main-stylesheet" id="main-ace-style"/>
    <link href="<c:url value='/template/admin/css/ace-part2.min.css' />" rel="stylesheet" type="text/css" media="all"/>
    <link href="<c:url value='/template/adminlte/bower-components/font-awesome/css/font-awesome.min.css' />"
          rel="stylesheet" type="text/css" media="all"/>
    <!-- Ionicons -->
    <link href="<c:url value='/template/adminlte/bower-components/Ionicons/css/ionicons.min.css' />" rel="stylesheet"
          type="text/css" media="all"/>
    <!-- Theme style -->
    <link href="<c:url value='/template/adminlte/dist/css/AdminLTE.min.css' />" rel="stylesheet" type="text/css"
          media="all"/>
    <!-- AdminLTE Skins. Choose a skin from the css/skins
         folder instead of downloading all of them to reduce the load. -->
    <link href="<c:url value='/template/adminlte/dist/css/skins/_all-skins.min.css' />" rel="stylesheet"
          type="text/css" media="all"/>
    <!-- Morris chart -->
    <link href="<c:url value='/template/adminlte/bower-components/morris.js/morris.css' />" rel="stylesheet"
          type="text/css" media="all"/>
    <!-- jvectormap -->
    <link href="<c:url value='/template/adminlte/bower-components/jvectormap/jquery-jvectormap.css' />"
          rel="stylesheet" type="text/css" media="all"/>
    <!-- Date Picker -->
    <link href="<c:url value='/template/adminlte/bower-components/bootstrap-datepicker/dist/css/bootstrap-datepicker.min.css' />"
          rel="stylesheet" type="text/css" media="all"/>
    <!-- Daterange picker -->
    <link href="<c:url value='/template/adminlte/bower-components/bootstrap-daterangepicker/daterangepicker.css' />"
          rel="stylesheet" type="text/css" media="all"/>
    <!-- bootstrap wysihtml5 - text editor -->
    <link href="<c:url value='/template/adminlte/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css' />"
          rel="stylesheet" type="text/css" media="all"/>
    <link rel="stylesheet"
          href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">
<%--    <link href="<c:url value='/template/admin/css/ace-skins.min.css' />" rel="stylesheet" type="text/css" media="all"/>--%>
<%--    <link href="<c:url value='/template/admin/css/ace-rtl.min.css' />" rel="stylesheet" type="text/css" media="all"/>--%>

<%--    <script type="text/javascript" src="<c:url value='/template/admin/js/ace-extra.min.js' />"></script>--%>
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">
    <!-- header -->
    <%@ include file="/common/admin/header.jsp" %>
    <!-- header -->
    <!-- Sidebar -->
    <%@ include file="/common/admin/menu.jsp" %>
    <!-- Sidebar -->
    <dec:body/>

    <!-- footer -->
    <%@ include file="/common/admin/footer.jsp" %>
    <!-- footer -->

    <!-- Control Sidebar -->
    <aside class="control-sidebar control-sidebar-dark" style="display: none;">
        <!-- Create the tabs -->
        <ul class="nav nav-tabs nav-justified control-sidebar-tabs">
            <li><a href="#control-sidebar-home-tab" data-toggle="tab"><i class="fa fa-home"></i></a></li>
            <li><a href="#control-sidebar-settings-tab" data-toggle="tab"><i class="fa fa-gears"></i></a></li>
        </ul>
        <!-- Tab panes -->
        <div class="tab-content">
            <!-- Home tab content -->
            <div class="tab-pane" id="control-sidebar-home-tab">
                <h3 class="control-sidebar-heading">Recent Activity</h3>
                <ul class="control-sidebar-menu">
                    <li>
                        <a href="javascript:void(0)">
                            <i class="menu-icon fa fa-birthday-cake bg-red"></i>

                            <div class="menu-info">
                                <h4 class="control-sidebar-subheading">Langdon's Birthday</h4>

                                <p>Will be 23 on April 24th</p>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a href="javascript:void(0)">
                            <i class="menu-icon fa fa-user bg-yellow"></i>

                            <div class="menu-info">
                                <h4 class="control-sidebar-subheading">Frodo Updated His Profile</h4>

                                <p>New phone +1(800)555-1234</p>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a href="javascript:void(0)">
                            <i class="menu-icon fa fa-envelope-o bg-light-blue"></i>

                            <div class="menu-info">
                                <h4 class="control-sidebar-subheading">Nora Joined Mailing List</h4>

                                <p>nora@example.com</p>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a href="javascript:void(0)">
                            <i class="menu-icon fa fa-file-code-o bg-green"></i>

                            <div class="menu-info">
                                <h4 class="control-sidebar-subheading">Cron Job 254 Executed</h4>

                                <p>Execution time 5 seconds</p>
                            </div>
                        </a>
                    </li>
                </ul>
                <!-- /.control-sidebar-menu -->

                <h3 class="control-sidebar-heading">Tasks Progress</h3>
                <ul class="control-sidebar-menu">
                    <li>
                        <a href="javascript:void(0)">
                            <h4 class="control-sidebar-subheading">
                                Custom Template Design
                                <span class="label label-danger pull-right">70%</span>
                            </h4>

                            <div class="progress progress-xxs">
                                <div class="progress-bar progress-bar-danger" style="width: 70%"></div>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a href="javascript:void(0)">
                            <h4 class="control-sidebar-subheading">
                                Update Resume
                                <span class="label label-success pull-right">95%</span>
                            </h4>

                            <div class="progress progress-xxs">
                                <div class="progress-bar progress-bar-success" style="width: 95%"></div>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a href="javascript:void(0)">
                            <h4 class="control-sidebar-subheading">
                                Laravel Integration
                                <span class="label label-warning pull-right">50%</span>
                            </h4>

                            <div class="progress progress-xxs">
                                <div class="progress-bar progress-bar-warning" style="width: 50%"></div>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a href="javascript:void(0)">
                            <h4 class="control-sidebar-subheading">
                                Back End Framework
                                <span class="label label-primary pull-right">68%</span>
                            </h4>

                            <div class="progress progress-xxs">
                                <div class="progress-bar progress-bar-primary" style="width: 68%"></div>
                            </div>
                        </a>
                    </li>
                </ul>
                <!-- /.control-sidebar-menu -->

            </div>
            <!-- /.tab-pane -->
            <!-- Stats tab content -->
            <div class="tab-pane" id="control-sidebar-stats-tab">Stats Tab Content</div>
            <!-- /.tab-pane -->
            <!-- Settings tab content -->
            <div class="tab-pane" id="control-sidebar-settings-tab">
                <form method="post">
                    <h3 class="control-sidebar-heading">General Settings</h3>

                    <div class="form-group">
                        <label class="control-sidebar-subheading">
                            Report panel usage
                            <input type="checkbox" class="pull-right" checked>
                        </label>

                        <p>
                            Some information about this general settings option
                        </p>
                    </div>
                    <!-- /.form-group -->

                    <div class="form-group">
                        <label class="control-sidebar-subheading">
                            Allow mail redirect
                            <input type="checkbox" class="pull-right" checked>
                        </label>

                        <p>
                            Other sets of options are available
                        </p>
                    </div>
                    <!-- /.form-group -->

                    <div class="form-group">
                        <label class="control-sidebar-subheading">
                            Expose author name in posts
                            <input type="checkbox" class="pull-right" checked>
                        </label>

                        <p>
                            Allow the user to show his name in blog posts
                        </p>
                    </div>
                    <!-- /.form-group -->

                    <h3 class="control-sidebar-heading">Chat Settings</h3>

                    <div class="form-group">
                        <label class="control-sidebar-subheading">
                            Show me as online
                            <input type="checkbox" class="pull-right" checked>
                        </label>
                    </div>
                    <!-- /.form-group -->

                    <div class="form-group">
                        <label class="control-sidebar-subheading">
                            Turn off notifications
                            <input type="checkbox" class="pull-right">
                        </label>
                    </div>
                    <!-- /.form-group -->

                    <div class="form-group">
                        <label class="control-sidebar-subheading">
                            Delete chat history
                            <a href="javascript:void(0)" class="text-red pull-right"><i class="fa fa-trash-o"></i></a>
                        </label>
                    </div>
                    <!-- /.form-group -->
                </form>
            </div>
            <!-- /.tab-pane -->
        </div>
    </aside>
    <!-- /.control-sidebar -->
    <!-- Add the sidebar's background. This div must be placed
         immediately after the control sidebar -->
    <div class="control-sidebar-bg"></div>
</div>
<%--ADMIN ACE--%>
<%--<script type="text/javascript" src="<c:url value='/template/admin/js/jquery-2.1.4.min.js' />"></script>--%>
<%--<script type="text/javascript" src="<c:url value='/template/admin/js/bootstrap.min.js' />"></script>--%>






<%--ADMIN LTE--%>
<!-- jQuery 3 -->
<script type="text/javascript"
        src="<c:url value='/template/adminlte/bower-components/jquery/dist/jquery.min.js' />"></script>
<!-- jQuery UI 1.11.4 -->
<script type="text/javascript"
        src="<c:url value='/template/adminlte/bower-components/jquery-ui/jquery-ui.min.js' />"></script>
<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
<script>
    $.widget.bridge('uibutton', $.ui.button);
</script>
<!-- Bootstrap 3.3.7 -->
<script type="text/javascript"
        src="<c:url value='/template/adminlte/bower-components/bootstrap/dist/js/bootstrap.min.js' />"></script>
<!-- Morris.js charts -->
<script type="text/javascript"
        src="<c:url value='/template/adminlte/bower-components/raphael/raphael.min.js' />"></script>
<script type="text/javascript"
        src="<c:url value='/template/adminlte/bower-components/morris.js/morris.min.js' />"></script>
<!-- Sparkline -->
<script type="text/javascript"
        src="<c:url value='/template/adminlte/bower-components/jquery-sparkline/dist/jquery.sparkline.min.js' />"></script>
<!-- jvectormap -->
<script type="text/javascript"
        src="<c:url value='/template/adminlte/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js' />"></script>
<script type="text/javascript"
        src="<c:url value='/template/adminlte/plugins/jvectormap/jquery-jvectormap-world-mill-en.js' />"></script>
<!-- jQuery Knob Chart -->
<script type="text/javascript"
        src="<c:url value='/template/adminlte/bower-components/jquery-knob/dist/jquery.knob.min.js' />"></script>
<!-- daterangepicker -->
<script type="text/javascript"
        src="<c:url value='/template/adminlte/bower-components/moment/min/moment.min.js' />"></script>
<script type="text/javascript"
        src="<c:url value='/template/adminlte/bower-components/bootstrap-daterangepicker/daterangepicker.js' />"></script>
<!-- datepicker -->
<script type="text/javascript"
        src="<c:url value='/template/adminlte/bower-components/bootstrap-datepicker/dist/js/bootstrap-datepicker.min.js' />"></script>
<!-- Bootstrap WYSIHTML5 -->
<script type="text/javascript"
        src="<c:url value='/template/adminlte/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js' />"></script>
<!-- Slimscroll -->
<script type="text/javascript"
        src="<c:url value='/template/adminlte/bower-components/jquery-slimscroll/jquery.slimscroll.min.js' />"></script>
<!-- FastClick -->
<script type="text/javascript"
        src="<c:url value='/template/adminlte/bower-components/fastclick/lib/fastclick.js' />"></script>
<!-- AdminLTE App -->
<script type="text/javascript" src="<c:url value='/template/adminlte/dist/js/adminlte.min.js' />"></script>
<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
<script type="text/javascript" src="<c:url value='/template/adminlte/dist/js/pages/dashboard.js' />"></script>
<!-- AdminLTE for demo purposes -->
<script type="text/javascript" src="<c:url value='/template/adminlte/dist/js/demo.js' />"></script>

<script type="text/javascript">
    jQuery(function ($) {
        //initiate dataTables plugin
        var myTable =
            $('#dynamic-table')
            //.wrap("<div class='dataTables_borderWrap' />")   //if you are applying horizontal scrolling (sScrollX)
                .DataTable({
                    bAutoWidth: false,
                    "aoColumns": [
                        {"bSortable": false},
                        null, null, null, null, null,
                        {"bSortable": false}
                    ],
                    "aaSorting": [],


                    //"bProcessing": true,
                    //"bServerSide": true,
                    //"sAjaxSource": "http://127.0.0.1/table.php"	,

                    //,
                    //"sScrollY": "200px",
                    //"bPaginate": false,

                    //"sScrollX": "100%",
                    //"sScrollXInner": "120%",
                    //"bScrollCollapse": true,
                    //Note: if you are applying horizontal scrolling (sScrollX) on a ".table-bordered"
                    //you may want to wrap the table inside a "div.dataTables_borderWrap" element

                    //"iDisplayLength": 50


                    select: {
                        style: 'multi'
                    }
                });


        $.fn.dataTable.Buttons.defaults.dom.container.className = 'dt-buttons btn-overlap btn-group btn-overlap';

        new $.fn.dataTable.Buttons(myTable, {
            buttons: [
                {
                    "extend": "colvis",
                    "text": "<i class='fa fa-search bigger-110 blue'></i> <span class='hidden'>Show/hide columns</span>",
                    "className": "btn btn-white btn-primary btn-bold",
                    columns: ':not(:first):not(:last)'
                },
                {
                    "extend": "copy",
                    "text": "<i class='fa fa-copy bigger-110 pink'></i> <span class='hidden'>Copy to clipboard</span>",
                    "className": "btn btn-white btn-primary btn-bold"
                },
                {
                    "extend": "csv",
                    "text": "<i class='fa fa-database bigger-110 orange'></i> <span class='hidden'>Export to CSV</span>",
                    "className": "btn btn-white btn-primary btn-bold"
                },
                {
                    "extend": "excel",
                    "text": "<i class='fa fa-file-excel-o bigger-110 green'></i> <span class='hidden'>Export to Excel</span>",
                    "className": "btn btn-white btn-primary btn-bold"
                },
                {
                    "extend": "pdf",
                    "text": "<i class='fa fa-file-pdf-o bigger-110 red'></i> <span class='hidden'>Export to PDF</span>",
                    "className": "btn btn-white btn-primary btn-bold"
                },
                {
                    "extend": "print",
                    "text": "<i class='fa fa-print bigger-110 grey'></i> <span class='hidden'>Print</span>",
                    "className": "btn btn-white btn-primary btn-bold",
                    autoPrint: false,
                    message: 'This print was produced using the Print button for DataTables'
                }
            ]
        });
        myTable.buttons().container().appendTo($('.tableTools-container'));

        //style the message box
        var defaultCopyAction = myTable.button(1).action();
        myTable.button(1).action(function (e, dt, button, config) {
            defaultCopyAction(e, dt, button, config);
            $('.dt-button-info').addClass('gritter-item-wrapper gritter-info gritter-center white');
        });


        var defaultColvisAction = myTable.button(0).action();
        myTable.button(0).action(function (e, dt, button, config) {

            defaultColvisAction(e, dt, button, config);


            if ($('.dt-button-collection > .dropdown-menu').length == 0) {
                $('.dt-button-collection')
                    .wrapInner('<ul class="dropdown-menu dropdown-light dropdown-caret dropdown-caret" />')
                    .find('a').attr('href', '#').wrap("<li />")
            }
            $('.dt-button-collection').appendTo('.tableTools-container .dt-buttons')
        });

        ////

        setTimeout(function () {
            $($('.tableTools-container')).find('a.dt-button').each(function () {
                var div = $(this).find(' > div').first();
                if (div.length == 1) div.tooltip({container: 'body', title: div.parent().text()});
                else $(this).tooltip({container: 'body', title: $(this).text()});
            });
        }, 500);


        myTable.on('select', function (e, dt, type, index) {
            if (type === 'row') {
                $(myTable.row(index).node()).find('input:checkbox').prop('checked', true);
            }
        });
        myTable.on('deselect', function (e, dt, type, index) {
            if (type === 'row') {
                $(myTable.row(index).node()).find('input:checkbox').prop('checked', false);
            }
        });


        /////////////////////////////////
        //table checkboxes
        $('th input[type=checkbox], td input[type=checkbox]').prop('checked', false);

        //select/deselect all rows according to table header checkbox
        $('#dynamic-table > thead > tr > th input[type=checkbox], #dynamic-table_wrapper input[type=checkbox]').eq(0).on('click', function () {
            var th_checked = this.checked;//checkbox inside "TH" table header

            $('#dynamic-table').find('tbody > tr').each(function () {
                var row = this;
                if (th_checked) myTable.row(row).select();
                else myTable.row(row).deselect();
            });
        });

        //select/deselect a row when the checkbox is checked/unchecked
        $('#dynamic-table').on('click', 'td input[type=checkbox]', function () {
            var row = $(this).closest('tr').get(0);
            if (this.checked) myTable.row(row).deselect();
            else myTable.row(row).select();
        });


        $(document).on('click', '#dynamic-table .dropdown-toggle', function (e) {
            e.stopImmediatePropagation();
            e.stopPropagation();
            e.preventDefault();
        });


        //And for the first simple table, which doesn't have TableTools or dataTables
        //select/deselect all rows according to table header checkbox
        var active_class = 'active';
        $('#simple-table > thead > tr > th input[type=checkbox]').eq(0).on('click', function () {
            var th_checked = this.checked;//checkbox inside "TH" table header

            $(this).closest('table').find('tbody > tr').each(function () {
                var row = this;
                if (th_checked) $(row).addClass(active_class).find('input[type=checkbox]').eq(0).prop('checked', true);
                else $(row).removeClass(active_class).find('input[type=checkbox]').eq(0).prop('checked', false);
            });
        });

        //select/deselect a row when the checkbox is checked/unchecked
        $('#simple-table').on('click', 'td input[type=checkbox]', function () {
            var $row = $(this).closest('tr');
            if ($row.is('.detail-row ')) return;
            if (this.checked) $row.addClass(active_class);
            else $row.removeClass(active_class);
        });


        /********************************/
        //add tooltip for small view action buttons in dropdown menu
        $('[data-rel="tooltip"]').tooltip({placement: tooltip_placement});

        //tooltip placement on right or left
        function tooltip_placement(context, source) {
            var $source = $(source);
            var $parent = $source.closest('table')
            var off1 = $parent.offset();
            var w1 = $parent.width();

            var off2 = $source.offset();
            //var w2 = $source.width();

            if (parseInt(off2.left) < parseInt(off1.left) + parseInt(w1 / 2)) return 'right';
            return 'left';
        }


        /***************/
        $('.show-details-btn').on('click', function (e) {
            e.preventDefault();
            $(this).closest('tr').next().toggleClass('open');
            $(this).find(ace.vars['.icon']).toggleClass('fa-angle-double-down').toggleClass('fa-angle-double-up');
        });
        /***************/


        /**
         //add horizontal scrollbars to a simple table
         $('#simple-table').css({'width':'2000px', 'max-width': 'none'}).wrap('<div style="width: 1000px;" />').parent().ace_scroll(
         {
					horizontal: true,
					styleClass: 'scroll-top scroll-dark scroll-visible',//show the scrollbars on top(default is bottom)
					size: 2000,
					mouseWheelLock: true
				  }
         ).css('padding-top', '12px');
         */


    })
</script>

<script type="text/javascript">
    if ('ontouchstart' in document.documentElement) document.write("<script src='/template/admin/js/jquery.mobile.custom.min.js'>" + "<" + "/script>");
</script>
<script type="text/javascript" src="<c:url value='/template/admin/js/jquery.dataTables.min.js' />"></script>
<script type="text/javascript" src="<c:url value='/template/admin/js/jquery.dataTables.bootstrap.min.js' />"></script>
<script type="text/javascript" src="<c:url value='/template/admin/js/dataTables.buttons.min.js' />"></script>
<script type="text/javascript" src="<c:url value='/template/admin/js/dataTables.select.min.js' />"></script>
<script type="text/javascript" src="<c:url value='/template/admin/js/ace.min.js' />"></script>
<script type="text/javascript" src="<c:url value='/template/admin/js/ace-elements.min.js' />"></script>
<script type="text/javascript" src="<c:url value='/template/admin/js/buttons.flash.min.js' />"></script>
<script type="text/javascript" src="<c:url value='/template/admin/js/buttons.html5.min.js' />"></script>
<script type="text/javascript" src="<c:url value='/template/admin/js/buttons.print.min.js' />"></script>
<script type="text/javascript" src="<c:url value='/template/admin/js/buttons.colVis.min.js' />"></script>
</body>
</html>