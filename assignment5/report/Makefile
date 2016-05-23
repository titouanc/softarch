FIGURES = $(subst .dia,.eps,$(wildcard *.dia))

Antoine-Carpentier_Titouan-Christophe_3.pdf: main.pdf
	cp $< $@

main.pdf: main.tex report.tex ${FIGURES}
	pdflatex $<
	pdflatex $<

%.eps: %.dia
	dia -e $@ $<