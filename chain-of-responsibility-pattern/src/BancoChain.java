public abstract class BancoChain {

	protected BancoChain proximo;
	protected IDBancos identificadorDoBanco;

	public BancoChain(IDBancos id) {
		proximo = null;
		identificadorDoBanco = id;
	}

	public void setProximo(BancoChain forma) {
		if (proximo == null) {
			proximo = forma;
		} else {
			proximo.setProximo(forma);
		}
	}

	public void efetuarPagamento(IDBancos id) throws Exception {
		if (podeEfetuarPagamento(id)) {
			efetuaPagamento();
		} else {
			if (proximo == null) {
				throw new Exception("banco não cadastrado");
			}
			proximo.efetuarPagamento(id);
		}
	}

	private boolean podeEfetuarPagamento(IDBancos id) {
		if (identificadorDoBanco == id) {
			return true;
		}
		return false;
	}

	protected abstract void efetuaPagamento();

}
