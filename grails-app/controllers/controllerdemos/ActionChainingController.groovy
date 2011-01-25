package controllerdemos

class ActionChainingController {

	static defaultAction = 'first'

	def first = {
		println "In First"
		request['message'] ='Hello World'
		redirect(action: 'second')
	}

	def second = {
		println "In Second"+ request['message']
		render ('In second Action.. forward from first')
	}

	def third = {
		println params;
		[third: 'Third']
	}

	def afterInterceptor = {modelAndView

	}
}
