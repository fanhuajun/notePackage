var IgnoreSpace = {
  init: function() {
    if (document.querySelectorAll('.ignore-spaces-btn')) {
      document.querySelectorAll('.ignore-spaces-btn').forEach(function(node) {
        node.remove();
      })
    }
    if (this.isValid()) {
      if (this.isCurrentIgnore()) {
        this.renderShowSpacesBtn();
      } else {
        this.renderIgnoreSpacesBtn();
      }
    }
  },

  // Check if it's code review diff page. like https://github.com/angular/angular.js/pull/10539/files?w=1
  isValid() {
    return document.querySelector('.diffbar') && document.querySelector('.pr-review-tools');
  },

  isCurrentIgnore() {
    return location.search.indexOf('w=1') > -1;
  },

  renderShowSpacesBtn() {
    // remove w=1 in url
    let url = location.href.replace('w=1&', '').replace('&w=1', '').replace('?w=1', '');
    this.addBtn(this.newBtn(url, 'Show Spaces', 'Click to show spaces in the Diff'));
  },

  renderIgnoreSpacesBtn() {
    // add w=1 in url
    let url = location.href + (location.href.indexOf('?') > -1 ? '&w=1' : '?w=1');
    this.addBtn(this.newBtn(url, 'Ignore Spaces', 'Click to hide spaces in the Diff'));
  },

  newBtn(url, text, hint) {
    let btn = document.createElement('a');
    btn.setAttribute('class', 'btn btn-sm btn-primary tooltipped tooltipped-n ignore-spaces-btn');
    btn.setAttribute('style', 'float: left; margin-right: 20px');
    btn.setAttribute('href', url);
    btn.setAttribute('aria-label', hint);
    btn.textContent = text;
    return btn;
  },

  addBtn(btn) {
    document.querySelector('.pr-review-tools').prepend(btn);
  }
}

IgnoreSpace.init();

// 当使用 pjax 更新页面时执行
document.addEventListener('_pjax:end', function() {
  IgnoreSpace.init();
}, false);
