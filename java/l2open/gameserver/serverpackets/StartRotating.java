package l2open.gameserver.serverpackets;

import l2open.gameserver.model.L2Character;

public class StartRotating extends L2GameServerPacket
{
	private int _charId, _degree, _side, _speed;

	public StartRotating(L2Character cha, int degree, int side, int speed)
	{
		_charId = cha.getObjectId();
		_degree = degree;
		_side = side;
		_speed = speed;
	}

	@Override
	protected final void writeImpl()
	{
		writeC(0x7a);
		writeD(_charId);
		writeD(_degree);
		writeD(_side);
		writeD(_speed);
	}
}