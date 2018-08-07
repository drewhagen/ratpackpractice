@Grab('io.ratpack:ratpack-groovy:1.3.3')

import static ratpack.groovy.Groovy.ratpack

ratpack {
  handlers {
    get {
      render "Hello, World!"
    }
    path("foo") { // binding was changed from get to path
      byMethod { // provided as part of handler's context
        get { // byMethod allows to specify for HTTP verb specific handlers. here is 'get'
          render "Hello, Foo Get!"
        }
        post { // and of course, here is 'post'
          render "Hello, Foo Post!"
        }
      }
    }
  }
}