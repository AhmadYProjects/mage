package mage.cards.s;

import java.util.UUID;
import mage.constants.SubType;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;

/**
 *
 * @author AhmadYProjects
 */
public final class SwordOfForgeAndFrontier extends CardImpl {

    public SwordOfForgeAndFrontier(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ARTIFACT}, "{3}");
        
        this.subtype.add(SubType.EQUIPMENT);

        // Equipped creature gets +2/+2 and has protection from red and from green.
        // Whenever equipped creature deals combat damage to a player, exile the top two cards of your library. You may play those cards this turn. You may play an additional land this turn.
        // Equip {2}
    }

    private SwordOfForgeAndFrontier(final SwordOfForgeAndFrontier card) {
        super(card);
    }

    @Override
    public SwordOfForgeAndFrontier copy() {
        return new SwordOfForgeAndFrontier(this);
    }
}
