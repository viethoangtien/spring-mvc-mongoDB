<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/common/taglib.jsp" %>
<!-- Left side column. contains the logo and sidebar -->
<aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
        <!-- Sidebar user panel -->
        <div class="user-panel">
            <div class="pull-left image">
                <img src="<c:url value="/template/adminlte/dist/img/user2-160x160.jpg"/> " class="img-circle"
                     alt="User Image">
            </div>
            <div class="pull-left info">
                <p>Hoàng Tiến Việt</p>
                <a href="#"><i class="fa fa-circle text-success"></i> Đang hoạt động</a>
            </div>
        </div>
        <!-- search form -->
        <form action="#" method="get" class="sidebar-form">
            <div class="input-group">
                <input type="text" name="q" class="form-control" placeholder="Tìm kiếm...">
                <span class="input-group-btn">
                <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
                </button>
              </span>
            </div>
        </form>
        <!-- /.search form -->
        <!-- sidebar menu: : style can be found in sidebar.less -->
        <ul class="sidebar-menu" data-widget="tree">
            <li class="header">Mục chính</li>
            <li>
                <a href="<c:url value="/admin-home"/> ">
                    <i class="fa fa-dashboard"></i> <span>Dashboard</span>
                    <span class="pull-right-container">
              <small class="label pull-right bg-green">main</small>
            </span>
                </a>
            </li>
            <li class="treeview">
                <a href="#">
                    <i class="fa fa-laptop"></i>
                    <span>NonVolatile</span>
                    <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
                </a>
                <ul class="treeview-menu">
                    <li><a href="<c:url value="/admin-computer-configuaration"/> "><i class="fa fa-circle-o"></i> Computer Information</a></li>
                    <li><a href="<c:url value="/admin-file-system"/> "><i class="fa fa-circle-o"></i> File Systems</a></li>
                    <li><a href="<c:url value="/admin-system-event-log"/> "><i class="fa fa-circle-o"></i> System Event Log</a></li>
                    <li><a href="<c:url value="/admin-browser-history"/> "><i class="fa fa-circle-o"></i> Browser History</a></li>
                    <li><a href="<c:url value="/admin-recent-file"/> "><i class="fa fa-circle-o"></i> File Recently</a></li>
                </ul>
            </li>
            <li class="treeview">
                <a href="#">
                    <i class="fa fa-table"></i> <span>Volatile</span>
                    <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
                </a>
                <ul class="treeview-menu">
                    <li class="treeview">
                        <a href="#"><i class="fa fa-circle-o"></i> Networking
                            <span class="pull-right-container">
                  <i class="fa fa-angle-left pull-right"></i>
                </span>
                        </a>
                        <ul class="treeview-menu">
                            <li><a href="<c:url value="/admin-network-connection"/> "><i class="fa fa-circle-o"></i>
                                Network Connection</a></li>
                            <li><a href="#"><i class="fa fa-circle-o"></i> Listening Port</a></li>
                            <li><a href="#"><i class="fa fa-circle-o"></i> Data Port</a></li>
                            <li><a href="#"><i class="fa fa-circle-o"></i> Routing table</a></li>
                        </ul>
                    </li>
                    <li><a href="#"><i class="fa fa-circle-o"></i> Process</a></li>
                    <li><a href="#"><i class="fa fa-circle-o"></i> User Logon</a></li>
                    <li><a href="#"><i class="fa fa-circle-o"></i> Clipboard Content</a></li>
                    <li><a href="#"><i class="fa fa-circle-o"></i> Open File</a></li>
                    <li><a href="#"><i class="fa fa-circle-o"></i> Service Information</a></li>
                    <li><a href="#"><i class="fa fa-circle-o"></i> Driver Information</a></li>
                    <li><a href="#"><i class="fa fa-circle-o"></i> Key Logger</a></li>
                    <li><a href="#"><i class="fa fa-circle-o"></i> Command History</a></li>
                    <li><a href="#"><i class="fa fa-circle-o"></i> Swap File</a></li>
                    <li><a href="#"><i class="fa fa-circle-o"></i> File Permission</a></li>
                </ul>
            </li>
        </ul>
    </section>
    <!-- /.sidebar -->
</aside>