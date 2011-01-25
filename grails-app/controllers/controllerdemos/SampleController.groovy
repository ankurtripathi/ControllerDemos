package controllerdemos

class SampleController {

	static defaultAction = 'hello'

	def hello = {

		String str = 'This is String'
//		[someString:str]
//	   render(view: '/actionChaining/actionChain', model: [someString:str,second:'This is Second'])
		redirect(action: 'bar')
	}

	def bar = {
		println 'This is anothe' + flash.message
	}

	def foo = {
		println 'This is foo'
	}

}
