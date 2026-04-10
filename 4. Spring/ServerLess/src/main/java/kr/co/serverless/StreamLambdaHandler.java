package kr.co.serverless;


public class StreamLambdaHandler implements RequestStreamHandler {
	private static SpringBootLambdaContainerHandler<AwsProxyRequest, AwsProxyResponse> handler;
	
	static {
		try {
			handler = SpringBootLambdaContainerHandler.getAwsProxyHandler(ServerLessApplication.class);
			
		} catch(ContainerInitializationException e) {
			throw new RuntimeException("스프링부트 초기화 실패", e);
		}
		
		@Override
		public void handleRequest(InputStream inputStream, OutputStream outpuStream, Context context) {
			throws IOEception{
				handler.proxyStream(inputStream, outputStream, context);
			}
		}
	}
}
