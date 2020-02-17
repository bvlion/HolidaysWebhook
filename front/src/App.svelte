<script>
  import Router from 'svelte-spa-router'
  import Home from './routes/home.svelte'
  import Showpage from './routes/showpage.svelte'
  
  const routes = {
      '/': Home,
      '/showpage/': Showpage,
  }
</script>

<div class="mdl-layout mdl-js-layout mdl-layout--fixed-header">
  <header class="mdl-layout__header">
    <div class="mdl-layout__header-row">
      <!-- Title -->
      <span class="mdl-layout-title">Title</span>
      <!-- Add spacer, to align navigation to the right -->
      <div class="mdl-layout-spacer"></div>
      <!-- Navigation. We hide it in small screens. -->
      <nav class="mdl-navigation mdl-layout--large-screen-only">
        <a class="mdl-navigation__link" href="">Link</a>
        <a class="mdl-navigation__link" href="">Link</a>
        <a class="mdl-navigation__link" href="">Link</a>
        <a class="mdl-navigation__link" href="">Link</a>
      </nav>
    </div>
  </header>
  <div class="mdl-layout__drawer">
    <span class="mdl-layout-title">Title</span>
    <nav class="mdl-navigation">
      <a class="mdl-navigation__link" href="">Link</a>
      <a class="mdl-navigation__link" href="">Link</a>
      <a class="mdl-navigation__link" href="">Link</a>
      <a class="mdl-navigation__link" href="">Link</a>
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
      <li><a href = "#">Help</a></li>
      <li><a href = "#">Privacy and Terms</a></li>
      <li><a href = "#">User Agreement</a></li>
     </ul>
    </div>
     
    <div class = "mdl-mini-footer__right-section">
     <button class = "mdl-mini-footer__social-btn">1</button>
     <button class = "mdl-mini-footer__social-btn">2</button>
     <button class = "mdl-mini-footer__social-btn">3</button>
    </div>
  
  </footer>
</div>