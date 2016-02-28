Antoine-Carpentier_Titouan-Christophe_1.pdf: main.pdf
	mv $< $@

%.pdf: %.tex %.bib report.tex
	pdflatex $<
	# bibtex $(subst .tex,,$<)
	pdflatex $<
	pdflatex $<

%.tex: %.md
	lunamark -t latex $< > $@

clean:
	rm -f *.aux *.log report.tex

mrproper: clean
	rm -f *.pdf
