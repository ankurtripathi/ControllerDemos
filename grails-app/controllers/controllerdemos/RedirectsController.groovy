package controllerdemos

class RedirectsController {

	def index = {

		redirect(action: 'foo')
	}

	def foo = {
//	   redirect(controller: 'sample' ,action: 'hello')

//		forward(controller: 'sample' , action: 'hello' ,params:[someString:'Some String'])
//		redirect(controller: 'sample' , action: 'hello' ,params:[someString:'Some String'])
//		redirect(url: 'http://www.google.co.in/')
		chain(action: 'cat', model: [user: 'Ankur'])
//		[user:'Ankur']
	}

	def bar = {
		def model = getChainModel()
		render(view: 'bar')
	}

	def cat = {
		chain(action: 'bar', model: [lastName: 'Tripathi'])
	}

	def beforeInterceptor = {
		println 'Executing Action from Interceptors ' + actionName
		if (actionName == 'bar') {
			return true
		}
	}

	def afterInterceptor = {model,modelAndView ->

		println "After Interceptor for " + actionName + ':' + modelAndView.viewName


	}
}
