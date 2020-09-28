package pages;

public class PageManager {
	private static PageManager pageManager;
	private LoginPage loginPage;
	private CarouselPage carouselPage;
	private SampleListPage sampleListPage;
	
	private PageManager() {
	}
	
	private synchronized static void crearInstancia() {
        if (pageManager == null) {
        	pageManager = new PageManager();
        }
    }
	
	public static PageManager obtenerInstancia() {
		crearInstancia();
		return pageManager;
	}
	
	public LoginPage obtenerLoginPage() {
		return (loginPage == null) ? loginPage = new LoginPage() : loginPage;
	}
	
	public CarouselPage obtenerCarouselPage() {
		return (carouselPage == null) ? carouselPage = new CarouselPage() : carouselPage;
	}
	
	public SampleListPage obtenerSampleListPage() {
		return (sampleListPage == null) ? sampleListPage = new SampleListPage() : sampleListPage;
	}
	
}
