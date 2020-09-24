package domain.gamestatus

import domain.deck.Deck
import domain.field.Field
import domain.hand.Hand
import domain.leader.Leader
case class GameStatus (
                      firstLeader: Leader,
                      firstDeck: Deck,
                      firstHand: Hand,
                      firstField: Field,
                      secondLeader: Leader,
                      secondDeck: Deck,
                      secondHand: Hand,
                      secondField: Field
                      )
