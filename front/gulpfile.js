const gulp = require('gulp')
const htmlmin = require('gulp-htmlmin')
const cleanCSS = require('gulp-clean-css')

gulp.task('minify-html', () => {
  return gulp.src('public/index.html')
    .pipe(htmlmin({
        collapseWhitespace : true,
        removeComments : true
    }))
    .pipe(gulp.dest('dist'))
})

gulp.task('minify-css', () =>
  gulp.src('public/css/global.css')
    .pipe(cleanCSS())
    .pipe(gulp.dest('dist/css'))
)