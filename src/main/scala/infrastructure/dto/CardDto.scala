package infrastructure.dto

import java.time.LocalDateTime

import domain.card.Card
import scalikejdbc._

case class CardDto(
                 createdAt: LocalDateTime,
                 updateAt: LocalDateTime
               ) extends SQLSyntaxSupport[CardDto] {
  def convertFrom(card: Card): CardDto = {

  }
}

