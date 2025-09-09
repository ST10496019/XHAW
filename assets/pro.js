
document.addEventListener('DOMContentLoaded', () => {
  const nav = document.querySelector('nav.primary-nav');
  const toggle = document.querySelector('.nav-toggle');
  if (nav && toggle){
    toggle.addEventListener('click', () => {
      nav.classList.toggle('open');
      const expanded = toggle.getAttribute('aria-expanded') === 'true';
      toggle.setAttribute('aria-expanded', String(!expanded));
    });
  }
});
