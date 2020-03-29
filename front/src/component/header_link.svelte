
<script>
  import {link} from 'svelte-spa-router'
  export let logined
</script>

{#if logined}
{logined}
<a class="mdl-navigation__link" href="/webhooks" use:link>WebHook 一覧</a>
{:else}
{logined}
<a class="mdl-navigation__link" href="/login" use:link>ログイン</a>
{/if}
<a class="mdl-navigation__link" href="/qa" use:link>Q & A</a>
<a class="mdl-navigation__link" href="/notices" use:link>お知らせ</a>
<a class="mdl-navigation__link" href="/inquiry" use:link>お問い合わせ</a>