package net.ambitious.holidays.webhook.controller

import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, RestController}

@RestController
@RequestMapping(Array("/"))
class SampleController {
  @RequestMapping(method = Array(RequestMethod.GET))
  def index = "index"
}
