package contracts.producer

import org.springframework.cloud.contract.spec.Contract

Contract.make {
	request { 
		method 'POST' 
		url '/producer-api' 
		body([ 
			   "clientId": "99"
		])
		headers {
			contentType('application/json')
		}
	}
	response { 
		status 200 
		body([ 
			   "clientName": "Ninety nine"
		])
		headers { 
			contentType('application/json')
		}
	}
}