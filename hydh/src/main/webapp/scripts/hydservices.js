;(function($) {

	hyd.services = {

		getSoapRequest:function(webmethod){
			return '<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.service.rabit.com/"><soapenv:Header/><soapenv:Body>' + webmethod + '</soapenv:Body></soapenv:Envelope>';
	    },

		setSoapHeaders: function(webmethod){
			var xmlhttp = RABIT.UTILS.getXmlhttpObject();
            xmlhttp.open("POST",RABIT.COMMONFUNCTIONS.getBrowserURL()+"/rabitservices?wsdl",false);
            xmlhttp.setRequestHeader("Content-Type", "text/xml; charset=utf-8");
            xmlhttp.setRequestHeader("SOAPAction", "http://ws.service.rabit.com/"+webmethod);
			return xmlhttp;
		},
};
})(jQuery);