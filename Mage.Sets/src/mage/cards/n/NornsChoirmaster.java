package mage.cards.n;

import java.util.UUID;
import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.EntersBattlefieldOrAttacksAllTriggeredAbility;
import mage.abilities.effects.common.counter.ProliferateEffect;
import mage.constants.SubType;
import mage.abilities.keyword.FlyingAbility;
import mage.abilities.keyword.FirstStrikeAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.filter.StaticFilters;

/**
 *
 * @author AhmadYProjects
 */
public final class NornsChoirmaster extends CardImpl {

    public NornsChoirmaster(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{3}{W}{W}");
        
        this.subtype.add(SubType.PHYREXIAN);
        this.subtype.add(SubType.ANGEL);
        this.power = new MageInt(5);
        this.toughness = new MageInt(4);

        // Flying
        this.addAbility(FlyingAbility.getInstance());

        // First strike
        this.addAbility(FirstStrikeAbility.getInstance());

        // Whenever a commander you control enters the battlefield or attacks, proliferate.
        Ability ability = new EntersBattlefieldOrAttacksAllTriggeredAbility(new ProliferateEffect(), StaticFilters.FILTER_CREATURES_OWNED_COMMANDER);
        this.addAbility(ability);
    }

    private NornsChoirmaster(final NornsChoirmaster card) {
        super(card);
    }

    @Override
    public NornsChoirmaster copy() {
        return new NornsChoirmaster(this);
    }
}
