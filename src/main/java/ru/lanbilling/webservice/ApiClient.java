package ru.lanbilling.webservice;

import javax.xml.ws.BindingProvider;

import ru.lanbilling.webservice.wsdl.Api3;
import ru.lanbilling.webservice.wsdl.Api3PortType;

/**
 * The LANBilling Web-Service client class.
 * 
 * @author Ilya Kanonirov
 *
 */
public class ApiClient {

	private Api3PortType port;

	public ApiClient(String host) {
		Api3 service = new Api3();
		port = service.getApi3();
		BindingProvider bindingProvider = (BindingProvider) port;
		bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://" + host + ":34012");
	}

	public Api3PortType login(String login, String password) {
		port.login(login, password);
		return port;
	}

	public Api3PortType getApi() {
		return port;
	}
}
