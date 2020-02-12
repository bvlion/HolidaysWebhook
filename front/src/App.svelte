<script>
  import Router from 'svelte-spa-router'
  import Home from './routes/home.svelte'
  import Showpage from './routes/showpage.svelte'
  
  const routes = {
      '/': Home,
      '/showpage/': Showpage,
  }
</script>

<body>
    <Router {routes}/>
</body>