package producer;

import java.util.ArrayList;
import java.util.List;

import models.SampleMessage;
import play.jobs.OnApplicationStart;
import play.modules.rabbitmq.producer.RabbitMQFirehose;

// TODO: Auto-generated Javadoc
/**
 * The Class RabbitMQSampleFirehose.
 */
@OnApplicationStart(async = true)
public class RabbitMQSampleFirehose extends RabbitMQFirehose<SampleMessage> {

	/** The count. */
	public int count = 0;

	/**
	 * Get data to be loaded.
	 * 
	 * @param n
	 *            the n
	 * @return the data
	 * @throws Exception
	 *             the exception
	 * @see play.modules.rabbitmq.producer.RabbitMQFirehose#getData(int)
	 */
	@Override
	protected List<SampleMessage> getData(int n) throws Exception {
		if (this.count >= 10) {
			return null;
		}
		List<SampleMessage> results = new ArrayList<SampleMessage>();
		for (int i = 0; i < n; i++) {
			results.add(new SampleMessage("field1", "field2"));
			this.count++;
		}
		return results;
	}

	/**
	 * Batch Size - How many records we will select at the time?.
	 * 
	 * @return the int
	 * @see play.modules.rabbitmq.producer.RabbitMQFirehose#batchSize()
	 */
	@Override
	protected int batchSize() {
		return 2;
	}

	/**
	 * Queue Name.
	 * 
	 * @return the string
	 * @see play.modules.rabbitmq.producer.RabbitMQFirehose#queueName()
	 */
	@Override
	protected String queueName() {
		return "myQueue";
	}

}