<script>
  import Router from 'svelte-spa-router'
  import Home from './routes/home.svelte'
  import Showpage from './routes/showpage.svelte'
  import HeaderLink from './component/header_link.svelte'
  import {link} from 'svelte-spa-router' 
  
  const routes = {
      '/': Home,
      '/showpage/': Showpage,
  }
</script>

<header class="mdl-layout__header">
  <div class="mdl-layout__header-row">
    <span class="mdl-layout-title">Title</span>
    <div class="mdl-layout-spacer"></div>
    <nav class="mdl-navigation mdl-layout--large-screen-only">
      <HeaderLink logined="" />
    </nav>
  </div>
</header>
<div class="mdl-layout__drawer">
  <span class="mdl-layout-title">Title</span>
  <nav class="mdl-navigation">
    <HeaderLink logined=false />
  </nav>
</div>
<main class="mdl-layout__content">
  <div class="page-content"><Router {routes}/></div>
</main>
<footer class = "mdl-mini-footer">
  <div class = "mdl-mini-footer__left-section">
   <div class = "mdl-logo">
    Copyright Information
   </div>
   <ul class = "mdl-mini-footer__link-list">
    <li><a href = "/sitemap" use:link>サイトマップ</a></li>
    <li><a href = "/privacy" use:link>プライバシーポリシー</a></li>
    <li><a href = "/rule" use:link>利用規約</a></li>
   </ul>
  </div>
  <div class = "mdl-mini-footer__right-section">
   <button class = "mdl-mini-footer__social-btn">1</button>
   <button class = "mdl-mini-footer__social-btn">2</button>
   <button class = "mdl-mini-footer__social-btn">3</button>
  </div>
</footer>