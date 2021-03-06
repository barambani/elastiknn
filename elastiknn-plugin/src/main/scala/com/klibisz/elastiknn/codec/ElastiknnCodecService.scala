package com.klibisz.elastiknn.codec

import org.apache.lucene.codecs.Codec
import org.elasticsearch.index.codec.CodecService

class ElastiknnCodecService extends CodecService(null, null) {

  override def codec(name: String): Codec =
    Codec.forName(ElastiknnCodecService.ELASTIKNN_86)

}

object ElastiknnCodecService {
  val ELASTIKNN_84 = "Elastiknn84Codec"
  val ELASTIKNN_86 = "Elastiknn86Codec"
}
