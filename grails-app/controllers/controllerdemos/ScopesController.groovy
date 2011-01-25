package controllerdemos

class ScopesController {

    def index = {
	    session.username = 'Ankur'
		flash.message = 'This is Flash Scope'

		redirect (controller: 'sample',action: 'hello')
	}
}
