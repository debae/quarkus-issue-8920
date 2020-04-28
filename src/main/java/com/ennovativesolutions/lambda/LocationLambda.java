package com.ennovativesolutions.lambda;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import com.ennovativesolutions.service.LocationService;
import lombok.extern.slf4j.Slf4j;

@Named("LocationLambda")
public class LocationLambda implements RequestHandler<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {

    LocationService locationService;

    @Inject
    public LocationLambda(LocationService locationService) {
        this.locationService = locationService;
    }

    @Override
    public APIGatewayProxyResponseEvent handleRequest(APIGatewayProxyRequestEvent apiGatewayProxyRequestEvent, Context context) {

        return new APIGatewayProxyResponseEvent();
    }
}
