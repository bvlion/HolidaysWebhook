package net.ambitious.holidays.webhook

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.ConfigurableApplicationContext

@SpringBootApplication
class HolidaysWebhookApplication {}

object HolidaysWebhookApplication {
  def main(args: Array[String]): Unit = SpringApplication.run(classOf[HolidaysWebhookApplication], args: _*)
}
